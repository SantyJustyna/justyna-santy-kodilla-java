package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Board {
    public static int BOARD_SIZE = 9;
    private List<Row> sudokuBoard = new ArrayList<>();

    public Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            sudokuBoard.add(new Row());
        }
    }

    public List<Row> getBoard() {
        return sudokuBoard;
    }

    public SudokuElement getElement(int col, int row) {
        return sudokuBoard.get(row).getCols().get(col);
    }

    public void setElement(int col, int row, SudokuElement element) {
        sudokuBoard.get(row).getCols().set(col, element);
    }

    public String toString() {
        String a = "";
        for (int i = 0; i < BOARD_SIZE; i++) {
            a += "|";
            for (int j = 0; j < BOARD_SIZE; j++) {
                SudokuElement b = sudokuBoard.get(i).getCols().get(j);
                if (b.getValue() == SudokuElement.EMPTY) {
                    a += "  " + " |";
                } else {
                    a += " " + b.getValue() + " " + "|";
                }
            }
            if (i == 2 || i == 5) {
                a += "\n=====================================\n";
            } else {
                a += "\n-------------------------------------\n";
            }
        }
        return a;
    }

    public boolean makeMove(Move move) {
        if (getElement(move.getCol(), move.getRow()).getValue() != SudokuElement.EMPTY) {
            return false;
        }

        setElement(move.getCol(), move.getRow(), move.getElement());
        return true;
    }

    public boolean checkMove(Move move) {
        if (getElement(move.getCol(), move.getRow()).getValue() != SudokuElement.EMPTY) {
            return false;
        } else {
            return true;
        }
    }

    public void easySampleBoard() {
        setElement(2, 0, new SudokuElement(9));
        setElement(1, 1, new SudokuElement(8));
        setElement(0, 2, new SudokuElement(4));
        setElement(3, 0, new SudokuElement(5));
        setElement(5, 0, new SudokuElement(1));
        setElement(3, 1, new SudokuElement(3));
        setElement(4, 2, new SudokuElement(9));
        setElement(5, 2, new SudokuElement(2));
        setElement(6, 0, new SudokuElement(3));
        setElement(7, 0, new SudokuElement(7));
        setElement(8, 0, new SudokuElement(8));
        setElement(6, 1, new SudokuElement(4));
        setElement(1, 3, new SudokuElement(3));
        setElement(2, 3, new SudokuElement(5));
        setElement(0, 4, new SudokuElement(9));
        setElement(1, 4, new SudokuElement(4));
        setElement(3, 3, new SudokuElement(2));
        setElement(5, 3, new SudokuElement(7));
        setElement(3, 4, new SudokuElement(1));
        setElement(5, 4, new SudokuElement(3));
        setElement(3, 5, new SudokuElement(9));
        setElement(4, 5, new SudokuElement(5));
        setElement(6, 4, new SudokuElement(2));
        setElement(7, 4, new SudokuElement(5));
        setElement(6, 5, new SudokuElement(6));
        setElement(7, 5, new SudokuElement(1));
        setElement(0, 6, new SudokuElement(6));
        setElement(1, 6, new SudokuElement(9));
        setElement(2, 6, new SudokuElement(4));
        setElement(1, 8, new SudokuElement(5));
        setElement(3, 6, new SudokuElement(7));
        setElement(4, 6, new SudokuElement(1));
        setElement(3, 7, new SudokuElement(6));
        setElement(4, 7, new SudokuElement(3));
        setElement(5, 8, new SudokuElement(8));
        setElement(7, 6, new SudokuElement(3));
        setElement(6, 7, new SudokuElement(7));
        setElement(7, 7, new SudokuElement(4));
    }

    public void hardSampleBoard() {
        setElement(1, 0, new SudokuElement(8));
        setElement(1, 1, new SudokuElement(6));
        setElement(0, 2, new SudokuElement(5));
        setElement(2, 2, new SudokuElement(2));
        setElement(5, 0, new SudokuElement(4));
        setElement(3, 1, new SudokuElement(2));
        setElement(4, 2, new SudokuElement(7));
        setElement(7, 0, new SudokuElement(5));
        setElement(6, 2, new SudokuElement(1));
        setElement(2, 3, new SudokuElement(6));
        setElement(0, 4, new SudokuElement(2));
        setElement(2, 4, new SudokuElement(1));
        setElement(3, 4, new SudokuElement(9));
        setElement(4, 5, new SudokuElement(8));
        setElement(7, 4, new SudokuElement(4));
        setElement(8, 5, new SudokuElement(9));
        setElement(0, 7, new SudokuElement(4));
        setElement(2, 7, new SudokuElement(9));
        setElement(1, 8, new SudokuElement(5));
        setElement(5, 6, new SudokuElement(3));
        setElement(3, 7, new SudokuElement(8));
        setElement(6, 6, new SudokuElement(7));
        setElement(7, 7, new SudokuElement(1));
    }
}
