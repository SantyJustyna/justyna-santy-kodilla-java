package com.kodilla.rps;

import java.io.IOException;
import java.util.Scanner;

public class UserDialogs {

    public static String getUsername(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            return name;
        }
    }
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number of rounds (1-5): ");
            String number = scanner.nextLine();
            try{
                int roundsNumber = Integer.parseInt(number);
                if (roundsNumber >= 1 && roundsNumber <= 5)
                    return roundsNumber;
            }catch(Exception e){
                System.out.println("Wrong number. Please try again.");
            }
        }
    }
    public static Move getUserMove(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice: R(ROCK), P(PAPER), S(SCISSORS), X(QUIT): ");
            String move = scanner.nextLine();
            switch(move){
                case "R": return Move.ROCK;
                case "P": return Move.PAPER;
                case "S": return Move.SCISSORS;
                case "X": return Move.QUIT;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }
    public static String repeatGame(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Restart game (Y/N)?");
            String decision = scanner.nextLine();
            return decision;
        }
    }
}
