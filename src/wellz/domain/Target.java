package wellz.domain;

public class Target {
    private final String icon = "x";
    private int row;
    private int col;

    public Target(Grid grid) {
        this.row = (int) ((Math.random() * (grid.getRows() - 0)) + 0);
        this.col = (int) ((Math.random() * (grid.getCols() - 0)) + 0);

        while(true) {
            String[][] gridArray = grid.getGrid();
            if(!gridArray[this.row][this.col].equals(grid.getNullPointer())) {
                this.row = (int) ((Math.random() * (grid.getRows() - 0)) + 0);
                this.col = (int) ((Math.random() * (grid.getCols() - 0)) + 0);
                continue;
            }
            break;
        }
    }

    public String getIcon() {
        return this.icon;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
}
