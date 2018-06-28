public class GameServer {

    private BoardConfiguration boardConfiguration;
    private Player[] players = new Player[2];

    public GameServer(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;
    }

    public void play(){
        BoardConfiguration boardConfiguration = new BoardConfiguration();
        System.out.println(boardConfiguration.printState());

        boolean isSuccess;
        Player current = players[0];
        int ind = 0;
        while (true){
            isSuccess = boardConfiguration.getMove(current);
            if (boardConfiguration.winner != 0){
                break;
            }
            if (!isSuccess){
                ind = (ind + 1) % 2;
                current = players[ind];
            }
            System.out.println(boardConfiguration.printState());
        }
        System.out.println(boardConfiguration.printState());
        System.out.println("Winner: " + boardConfiguration.winner);
    }
}
