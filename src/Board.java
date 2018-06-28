import java.util.ArrayList;

public class Board {

    private ArrayList<Ship> ships;
    public int[][] board = new int[10][10];
    private boolean allDead = false;

    public Board(ArrayList<Ship> ships){
        this.ships = ships;
    }

    public boolean shot(Coord sh){
        for (Ship ship : ships){
            if (ship.checkShot(sh)){
                allDead = checkForAllDead();
                return true;
            }
        }
        return false;
    }

    private boolean checkForAllDead(){
        for (Ship ship : ships){
            if (ship.lives > 0){
                return false;
            }
        }
        return true;
    }

    public boolean isAllDead() {
        return allDead;
    }

    @Override
    public String toString() {

//        for (Ship ship : ships){
//            for (int i = 0; i<ship.length; i++){
//                if (ship.shots[i]){
//                    board[ship.cells.get(i).x][ship.cells.get(i).y] = 2;
//                }
//            }
//        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i<10; i++){
            for (int j=0; j<10; j++){
                switch (board[i][j]) {
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
            b.append("\n");
        }
        return b.toString();
    }
}
