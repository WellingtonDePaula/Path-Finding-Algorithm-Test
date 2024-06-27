package wellz.domain;

public class Grid {
    private String[][] grid;
    private final int rows;
    private final int cols;
    private String nullPointer;
    private boolean reached = false;

    public Grid(int rows, int cols, String nullPointer) {
        this.nullPointer = nullPointer;
        this.rows = rows;
        this.cols = cols;
        this.grid = new String[rows][cols];
    }

    public void setGrid() {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = nullPointer;
            }
        }
    }

    public void setGrid(Player player, Target target) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = nullPointer;
            }
        }
        int row = target.getRow();
        int col = target.getCol();
        String icon = target.getIcon();
        grid[row][col] = icon;

        row = player.getRow();
        col = player.getCol();
        icon = player.getIcon();
        grid[row][col] = icon;

        reached = checkReached(player, target);
    }

    public void draw() {
        for(int i = 0; i < grid.length; i++) {
            System.out.println();
            for(int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "  ");
            }
        }
        System.out.println();
    }

    private boolean checkReached(Player player, Target target) {
        if(player.getRow() == target.getRow() && player.getCol() == target.getCol()) {
            return true;
        } else {
            return false;
        }
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public String[][] getGrid() {
        return this.grid;
    }

    public String getNullPointer() {
        return this.nullPointer;
    }

    public boolean isReached() {
        return this.reached;
    }
}