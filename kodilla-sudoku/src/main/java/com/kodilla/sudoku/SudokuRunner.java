package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRunner {

    public void run() {

        UserChoice decision;

        do {
            Board board = new Board();
            Solver solver = new Solver(board);
            List<Move> moves = new ArrayList<>();
            boolean sampleBoard = false;

            if (UserDialogs.chooseGame() == UserChoice.RANDOM) {
                sampleBoard = true;
            }

            if (!sampleBoard) {
                System.out.println(board);
                int numberOfMoves = UserDialogs.chooseNumberOfInitialMoves();
                while (moves.size() < numberOfMoves) {
                    Move move = UserDialogs.getMove();
                    if (solver.checkIfPlaceIsValid(board, move.getCol(), move.getRow(), move.getElement()) && board.checkMove(move)) {
                        board.makeMove(move);
                        moves.add(move);
                    }
                    System.out.println(board);
                    System.out.println("Moves to make: " + (numberOfMoves - moves.size()));
                }
                if (solver.solveSudoku(board)) {
                    System.out.println(board);
                } else {
                    System.out.println("Unsolvable :(");
                }
            } else {
                UserChoice boardChoice = UserDialogs.chooseBoard();
                if (boardChoice == UserChoice.EASY) {
                    board.easySampleBoard();
                    System.out.println(board);
                    if (solver.solveSudoku(board)) {
                        System.out.println(board);
                    } else {
                        System.out.println("Unsolvable :(");
                    }
                } else {
                    board.hardSampleBoard();
                    System.out.println(board);
                    if (solver.solveSudoku(board)) {
                        System.out.println(board);
                    } else {
                        System.out.println("Unsolvable :(");
                    }
                }
            }
            decision = UserDialogs.quitOrPlay();
        } while (decision == UserChoice.PLAY);
    }
}

