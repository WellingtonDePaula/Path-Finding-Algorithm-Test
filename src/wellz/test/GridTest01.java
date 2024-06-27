package wellz.test;

import wellz.domain.ConsoleScanner;
import wellz.domain.Grid;

public class GridTest01 {
    public static void main(String[] args) {
        ConsoleScanner sc = new ConsoleScanner();
        int rows = sc.inputRows();
        int cols = sc.inputCols();

        while(true) {
            Grid grid = new Grid(rows, cols, ".");
            grid.setGrid();
            grid.draw();
            break;
        }
    }
}
