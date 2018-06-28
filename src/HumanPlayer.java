import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class HumanPlayer extends Player {

    ArrayList<Coord> moves = new ArrayList<>();

    public HumanPlayer(int playerNum, String moves) {
        super(playerNum);
        String[] sepmoves = moves.split(" ");
        for(String move:sepmoves){
            int x = Character.getNumericValue(move.charAt(0));
            int y = Character.getNumericValue(move.charAt(2));
            this.moves.add(new Coord(x, y));
        }
    }

    @Override
    public Coord makeMove(BoardConfiguration configuration) {
        if (moves.size() > 0){
            Coord shot = moves.get(0);
            moves.remove(0);
            return shot;
        }
        // no moves left? go random!
        Board enemyBoard;
        if (playerNum == 1) enemyBoard = configuration.getBoard2();
        else enemyBoard = configuration.getBoard1();
        return randomShot(enemyBoard);
    }

    private Coord randomShot(Board board){
        while (true){
            int x = ThreadLocalRandom.current().nextInt(0, 10);
            int y = ThreadLocalRandom.current().nextInt(0, 10);
            if (board.board[x][y] == 0){
                return new Coord(x, y);
            }
        }
    }
}
