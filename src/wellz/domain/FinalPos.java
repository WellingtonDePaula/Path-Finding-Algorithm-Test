package wellz.domain;

public class FinalPos {
    private int row = 0;
    private int col = 0;

    public FinalPos() {

    }

    public FinalPos(int row, int col) {
        this.row = row;
        this.col = col;
    }
    private final String pointer = "x";

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public String getPointer() {
        return this.pointer;
    }
}
