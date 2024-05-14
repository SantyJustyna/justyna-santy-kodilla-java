package com.kodilla.sudoku;

import java.util.Scanner;

public class UserDialogs {
    public static Move getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Make a move indicating colum number(0-8), row number (0-8) and chosen number(1-9) : (e.g. 2, 2, 1):");
            String s = scanner.nextLine();
            try {
                String[] coords = s.split(",");
                int col = Integer.parseInt(coords[0]);
                int row = Integer.parseInt(coords[1]);
                SudokuElement value = new SudokuElement(Integer.parseInt(coords[3]));
                if (col >= 0 && col < 9 && row >= 0 && row < 9) {
                    return new Move(col, row, value);
                }
            } catch (Exception e) {
                System.out.println("Wrong move. Try again.");
            }
        }
    }

    public static String chooseGame() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("To set initial values yourself press (A), to solve random sudoku press (B)");
            String x = scanner.nextLine();
            try {
                if (x.equals("A") || x.equals("a")) {
                    return "A";
                } else if (x.equals("B") || x.equals("b")){
                    return "B";
                }
            } catch (Exception e) {
                System.out.println("You can only choose (A) or (B). Try again please.");
            }
        }

    }
}
