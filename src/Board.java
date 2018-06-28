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
        for (Ship ship : ships){
            for
        }
    }
}
