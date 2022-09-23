package turle;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;

    }

    public int getColumn(){
        return column;
    }

    public void setColumn(int newColumn){
        column = newColumn;
    }

    @Override
    public boolean equals(Object obj){
        Position comparedPosition = (Position) obj;
        boolean rowsAreEqual = comparedPosition.row == this.row;
        boolean columnAreEqual = comparedPosition.column == this.column;
        return rowsAreEqual && columnAreEqual;
    }
}

