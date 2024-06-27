package wellz.domain;

public class Player {
    private final String icon = "I";
    private int row;
    private int col;

    public Player(Grid grid) {
        this.row = grid.getRows()/2;
        this.col = grid.getCols()/2;
    }

    public void play() {

    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public String getIcon() {
        return this.icon;
    }
}
