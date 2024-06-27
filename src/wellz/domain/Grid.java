package wellz.domain;

public class Grid {
    private final int cols = 5;
    private final int rows = 5;

    private String[][] grid = new String[rows][cols];
    private final String nullPointer = ".";

    public void setUp() {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = nullPointer;
            }
        }
    }
    public void setUp(Player player, FinalPos finalPos) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = nullPointer;
            }
        }
        int row = finalPos.getRow();
        int col = finalPos.getCol();
        String pointer = finalPos.getPointer();

        if(grid[row][col].equals(nullPointer)) {
            grid[row][col] = pointer;
        }

        row = player.getRow();
        col = player.getCol();
        pointer = player.getPointer();
        grid[row][col] = pointer;
    }

    public void print() {
        for(int i = 0; i < grid.length; i++) {
            System.out.println();
            for(int j = 0; j < grid[i].length; j++) {
                System.out.print("  ");
                System.out.print(grid[i][j]);
            }
        }
    }
}
