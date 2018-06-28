public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Coord){
            return (this.x == ((Coord) o).x) && (this.y == ((Coord) o).y);
        }
        return false;
    }
}
