package com.kodilla.sudoku;

public class Solver {
    private final Board board;

    public Solver(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public boolean checkElementInRow(Board board, int row, SudokuElement element) {
        for (int col = 0; col < 9; col++) {
            if (board.getElement(col, row).equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkElementInCol(Board board, int col, SudokuElement element) {
        for (int row = 0; row < 9; row++) {
            if (board.getElement(col, row).equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkElementInBox(Board board, int col, int row, SudokuElement element) {
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board.getElement(j, i).equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkIfPlaceIsValid(Board board, int col, int row, SudokuElement element) {
        if (!checkElementInRow(board, row, element)
                && !checkElementInCol(board, col, element)
                && !checkElementInBox(board, col, row, element)) {
            return true;
        }
        return false;
    }

    public boolean solveSudoku(Board board) {
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                if (board.getElement(col, row).getValue() == SudokuElement.EMPTY) {
                    for (int tryNumber = 1; tryNumber <= 9; tryNumber++) {
                        SudokuElement element = new SudokuElement(tryNumber);
                        if (checkIfPlaceIsValid(board, col, row, element)) {
                            board.setElement(col, row, element);

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board.setElement(col, row, new SudokuElement(SudokuElement.EMPTY));
                            }
                        }
                    }
                    return false;
                }
            }
        }
        System.out.println("Solved!!!");
        return true;
    }
}
