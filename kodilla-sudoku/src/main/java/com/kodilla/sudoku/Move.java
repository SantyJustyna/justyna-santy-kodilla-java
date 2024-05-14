package com.kodilla.sudoku;

public class Move {
    private int col;
    private int row;
    private SudokuElement element;

    public Move(int col, int row, SudokuElement element) {
        this.col = col;
        this.row = row;
        this.element = element;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public SudokuElement getElement() {
        return element;
    }
}
