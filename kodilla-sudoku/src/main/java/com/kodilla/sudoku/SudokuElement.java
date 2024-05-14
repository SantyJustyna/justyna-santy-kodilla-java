package com.kodilla.sudoku;

import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private List<Integer> possibleValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
}
