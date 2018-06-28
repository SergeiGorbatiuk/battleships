import java.util.ArrayList;

public class BoardConfiguration {

    private Board board1;
    private Board board2;
    public int winner = 0;

    public BoardConfiguration(){
        board1 = mockConfiguration();
        board2 = mockConfiguration();

    }

    public boolean getMove(Player player){
        Coord shot = player.makeMove(this);
        Board performBoard;
        if (player.playerNum == 1){
            performBoard = board2;
        }
        else {
            performBoard = board1;
        }

        boolean res = performBoard.shot(shot);

        if (res){
            System.out.println("Player" + player.playerNum+ " shooted: "+ shot.toString()+ "\nGOTHCA!\n");
            performBoard.board[shot.x][shot.y] = 2;
            if (performBoard.isAllDead()){
                winner = player.playerNum;
            }
        }
        else {
            System.out.println("Player" + player.playerNum+ " shooted: "+ shot.toString()+"\n");
            performBoard.board[shot.x][shot.y] = 1;
        }

        return res;
    }

    private Board mockConfiguration() {
        ArrayList<Ship> defships = new ArrayList<>();
        defships.add(new Ship(0, 1, 0, 4));
//        defships.add(new Ship(1, 8, 3, 8));
//        defships.add(new Ship(7, 2, 7, 4));
//        defships.add(new Ship(3, 4, 4, 4));
//        defships.add(new Ship(6, 7, 6, 8));
//        defships.add(new Ship(8, 7, 8, 8));
//        defships.add(new Ship(5, 1, 5, 2));
//        defships.add(new Ship(9, 0, 9, 0));
//        defships.add(new Ship(9, 4, 9, 4));
//        defships.add(new Ship(1, 6, 1, 6));
//        defships.add(new Ship(2, 1, 2, 1));

        return new Board(defships);
    }

    public Board getBoard1() {
        return board1;
    }

    public Board getBoard2() {
        return board2;
    }

    public String printState(){
        StringBuilder b = new StringBuilder();
        Board b1 = board1;
        Board b2 = board2;
        b.append("Player1             | Player2\n");
        for (int i = 0; i<10; i++){
            addRow(b, b1, i);
            b.append("| ");
            addRow(b, b2, i);
            b.append("\n");
        }
        return b.toString();
    }

    private void addRow(StringBuilder b, Board b2, int i) {
        for (int j=0; j<10; j++){
            switch (b2.board[i][j]) {
                case 0: {
                    b.append("O ");
                    break;
                }
                case 1: {
                    b.append("_ ");
                    break;
                }
                case 2: {
                    b.append("X ");
                    break;
                }
            }
        }
    }
}
