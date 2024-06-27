package wellz.domain;

public class Player {
    private int row = 0;
    private int col = 0;
    private boolean reached = false;
    private final String pointer = "I";

    public void play(FinalPos finalPos) {
        int row = finalPos.getRow();
        int col = finalPos.getCol();

        if (this.row != row) {
            if (row - this.row > 0) {
                this.row++;
                return;
            } else {
                this.row--;
                return;
            }
        }
        if (this.col != col) {
            if (col - this.col > 0) {
                this.col++;
                return;
            } else {
                this.col--;
                return;
            }
        }

        if(this.row == row && this.col == col) {
            reached = true;
        }
    }















    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getPointer() {
        return this.pointer;
    }

    public boolean isReached() {
        return this.reached;
    }
}