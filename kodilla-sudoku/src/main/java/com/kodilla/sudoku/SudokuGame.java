package com.kodilla.sudoku;

public class SudokuGame {
private final Board board;

    public SudokuGame(Board board) {
        this.board = board;
    }
    public Board getBoard() {
        return board;
    }
    public static class SudokuGameBuilder {
        private Board board = new Board();




    }//class end
}
