package wellz.domain;

public class Init {
    int playerRow = 0;
    int playerCol = 0;
    int finalRow = 0;
    int finalCol = 0;
    public Init() {

    }

    public Init(int playerRow, int playerCol, int finalRow, int finalCol) {
        this.playerRow = playerRow;
        this.playerCol = playerCol;
        this.finalRow = finalRow;
        this.finalCol = finalCol;
    }
    public void init() {
        Grid grid = new Grid();
        Player player = new Player(playerRow, playerCol);
        FinalPos finalPos = new FinalPos(finalRow, finalCol);

        while(!player.isReached()) {
            grid.setUp(player, finalPos);
            grid.print();
            player.play(finalPos);
            System.out.println("\n\n-----------------");
        }
        grid.setUp(player, finalPos);
        grid.print();
    }
}
