public class Main {
    public static void main(String[] args) {
        HumanPlayer p1 = new HumanPlayer(1,"0,1 0,2 0,3");
        ComputerPlayer p2 = new ComputerPlayer(2);
        GameServer gameServer = new GameServer(p1, p2);
        gameServer.play();
    }
}
