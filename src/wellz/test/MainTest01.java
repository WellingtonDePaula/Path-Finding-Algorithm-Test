package wellz.test;

import wellz.domain.FinalPos;
import wellz.domain.Grid;
import wellz.domain.Player;

public class MainTest01 {
    public static void main(String[] args) {
        Grid grid = new Grid();
        Player player = new Player();
        FinalPos finalPos = new FinalPos();

        while(true) {
            grid.setUp(player, finalPos);
            grid.print();
            player.play(finalPos);
            System.out.println("\n------------------------------------");
            if(player.isReached()) {
                break;
            }
        }
        grid.setUp(player, finalPos);
        grid.print();
    }
}
