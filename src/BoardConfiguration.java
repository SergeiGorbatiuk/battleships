import java.util.ArrayList;

public class BoardConfiguration {

    private Board board1;
    private Board board2;

    public BoardConfiguration(){
        board1 = mockConfiguration();
        board2 = mockConfiguration();

    }

    private Board mockConfiguration() {
        ArrayList<Ship> defships = new ArrayList<>();


        return new Board(defships);
    }

    public Board getBoard1() {
        return board1;
    }

    public Board getBoard2() {
        return board2;
    }
}
