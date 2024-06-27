package wellz.test;

import wellz.domain.ConsoleScanner;
import wellz.domain.Grid;
import wellz.domain.Player;
import wellz.domain.Target;

public class GridTest01 {
    public static void main(String[] args) {
        ConsoleScanner sc = new ConsoleScanner();
        int rows = sc.inputRows();
        int cols = sc.inputCols();
        Grid grid = new Grid(rows, cols, ".");
        Player player = new Player(grid);
        grid.setGrid();
        Target target = new Target(grid);

        while(true) {
            grid.setGrid(player, target);
            grid.draw();
            player.play();
            break;
        }
    }
}
