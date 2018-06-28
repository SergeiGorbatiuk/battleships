public abstract class Player {
    public int playerNum;

    public Player(int playerNum){
        this.playerNum = playerNum;
    }

    public abstract Coord makeMove(BoardConfiguration configuration);

}
