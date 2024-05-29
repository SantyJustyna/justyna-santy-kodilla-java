package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<SudokuElement> cols = new ArrayList<>();

    public Row() {
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            cols.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    public List<SudokuElement> getCols() {
        return cols;
    }
}
