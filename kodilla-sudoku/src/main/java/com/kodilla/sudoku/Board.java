package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
                if (b.getValue() == -1) {
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

    public void sampleBoard() {
        setElement(1, 2, new SudokuElement(1));
        setElement(2, 4, new SudokuElement(3));
        setElement(4, 5, new SudokuElement(6));
        setElement(1, 3, new SudokuElement(2));
        setElement(2, 6, new SudokuElement(5));
        setElement(4, 7, new SudokuElement(9));
    }







}
