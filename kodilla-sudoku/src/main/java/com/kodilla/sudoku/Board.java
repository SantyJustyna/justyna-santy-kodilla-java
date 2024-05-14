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

    public String toString() {
        String a = "";
        for (int i = 0; i < BOARD_SIZE; i++) {
            a += "|";
            for (int j = 0; j < BOARD_SIZE; j++) {
                SudokuElement b = sudokuBoard.get(i).getRow().get(j);
                if (b.getValue() == -1) {
                    a += "  " + "|";
                } else {
                    a += " " + b.getValue() + " " + "|";
                }
            }
            if (i == 2 || i == 5) {
                a += "\n============================\n";
            } else {
                a += "\n----------------------------\n";
            }
        }
        return a;
    }
}
