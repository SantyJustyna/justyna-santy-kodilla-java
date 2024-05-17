package com.kodilla.sudoku;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SudokuElement that = (SudokuElement) o;

        if (value != that.value) return false;
        return Objects.equals(possibleValues, that.possibleValues);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (possibleValues != null ? possibleValues.hashCode() : 0);
        return result;
    }
}
