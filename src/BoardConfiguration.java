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
        defships.add(new Ship(1, 0, 4, 0));
        defships.add(new Ship(8, 1, 8, 3));
        defships.add(new Ship(2, 7, 4, 7));
        defships.add(new Ship(4, 3, 4, 4));
        defships.add(new Ship(7, 6, 8, 6));
        defships.add(new Ship(7, 8, 8, 8));

        return new Board(defships);
    }
}
