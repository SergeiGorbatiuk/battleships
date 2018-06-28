import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer extends Player {

    public ComputerPlayer(int playerNum) {
        super(playerNum);
    }

    @Override
    public Coord makeMove(BoardConfiguration configuration) {
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
