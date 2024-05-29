package com.kodilla.sudoku;

import java.util.Scanner;

public class UserDialogs {
    public static Move getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Make a move indicating column number(0-8), row number (0-8) and chosen number(1-9) : (e.g. 2, 2, 1): ");
            String move = scanner.nextLine();
            try {
                String[] coords = move.split(",");
                int col = Integer.parseInt(coords[0]);
                int row = Integer.parseInt(coords[1]);
                SudokuElement element = new SudokuElement(Integer.parseInt(coords[2]));
                if (col >= 0 && col < 9 && row >= 0 && row < 9 && element.getPossibleValues().contains(element.getValue())) {
                    return new Move(col, row, element);
                }
                System.out.println("Try again. Column number(0-8), row number (0-8) and chosen number(1-9)");
            } catch (Exception e) {
                System.out.println("Wrong move. Try again.");
            }
        }
    }

    public static int chooseNumberOfInitialMoves() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Indicate the number of initial moves (6-20)");
            String answear = scanner.nextLine();
            try {
                int numberOfMoves = Integer.parseInt(answear);
                if (numberOfMoves >= 6 && numberOfMoves <= 20) {
                    return numberOfMoves;
                }
                System.out.println("Try again. Indicate number (6 - 20).");
            } catch (Exception e) {
                System.out.println("Wrong value. Try again!");
            }
        }
    }

    public static UserChoice chooseGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("To set initial values yourself press (Y), to solve random sudoku press (R)");
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "Y":
                    return UserChoice.YOURSELF;
                case "R":
                    return UserChoice.RANDOM;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }

    public static UserChoice quitOrPlay() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("To play again press (P), to quit press (Q).");
            String quitOrPlay = scanner.nextLine().toUpperCase();
            switch (quitOrPlay) {
                case "P":
                    return UserChoice.PLAY;
                case "Q":
                    return UserChoice.QUIT;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }

    public static UserChoice chooseBoard() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("To solve easy board press (E), to solve hard board (H)");
            String boardChoice = scanner.nextLine().toUpperCase();
            switch (boardChoice) {
                case "E":
                    return UserChoice.EASY;
                case "H":
                    return UserChoice.HARD;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }
}
