public class Coord {
    public int x;
    public int y;
    private boolean shoot;

    public Coord(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Coord){
            return (this.x == ((Coord) o).x) && (this.y == ((Coord) o).y);
        }
        return false;
    }
}
