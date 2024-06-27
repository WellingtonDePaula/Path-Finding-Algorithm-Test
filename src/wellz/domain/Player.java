package wellz.domain;

public class Player {
    private final String icon = "I";
    private int row;
    private int col;

    public Player(Grid grid) {
        this.row = grid.getRows()/2;
        this.col = grid.getCols()/2;
    }

    public void play(Grid grid, Target target, boolean isDiagonal) {
        if(this.row != target.getRow()) {
            if (this.row < target.getRow()) {
                this.row++;
                if(!isDiagonal) {
                    return;
                }
            } else {
                this.row--;
                if(!isDiagonal) {
                    return;
                }
            }
        }

        if(this.col != target.getCol()) {
            if (this.col < target.getCol()) {
                this.col++;
                if(!isDiagonal) {
                    return;
                }
            } else {
                this.col--;
                if(!isDiagonal) {
                    return;
                }
            }
        }
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
