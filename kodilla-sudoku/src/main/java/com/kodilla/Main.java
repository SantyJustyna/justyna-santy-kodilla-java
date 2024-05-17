package com.kodilla;

import com.kodilla.sudoku.Board;
import com.kodilla.sudoku.UserDialogs;

public class Main {
    public static void main(String[] args) {

        UserDialogs.chooseGame();
        Board board = new Board();
        board.sampleBoard();
        System.out.println(board);








    }
}