package wellz.domain;

public class Grid {
    private String[][] grid;
    private String nullPointer;

    public Grid(int rows, int cols, String nullPointer) {
        this.nullPointer = nullPointer;
        this.grid = new String[rows][cols];
    }

    public void setGrid() {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = nullPointer;
            }
        }
    }

    public void draw() {
        for(int i = 0; i < grid.length; i++) {
            System.out.println();
            for(int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "  ");
            }
        }
    }
}