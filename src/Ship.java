import jdk.internal.util.xml.impl.Pair;

import java.util.ArrayList;

public class Ship {

    public int lives;
    public ArrayList<Coord> cells;

    public Ship(int x1, int y1, int x2, int y2){

        lives = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        cells.add(new Coord(x1, y1));
        if (x1 == x2){
            for (int i = y1 + 1; i <= y2; i++){
                cells.add(new Coord(x1, i));
            }
        }
        else {
            for (int i = x1 + 1; i <= x2; i++){
                cells.add(new Coord(i, y1));
            }
        }
    }

    public boolean checkShot(Coord sh){
        for (int i=0; i < cells.size(); i++){
            if (sh.equals(cells.get(i))){
                lives -= 1;
            }
        }
        return false;
    }
}