package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<SudokuElement> singleRow = new ArrayList<>();

    public Row() {
        for( int i = 0; i < Board.BOARD_SIZE; i++) {
            singleRow.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }
    public List<SudokuElement> getRow() {
        return singleRow;
    }
}
