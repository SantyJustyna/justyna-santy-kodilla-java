package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class RpsRunner {
    public void run(){

        String decision;
        do {
            String username = UserDialogs.getUsername();
            int numberOfRounds = UserDialogs.getNumberOfRounds();
            int round = 1;
            boolean quitSelected = false;
            int userScore = 0;
            int computerScore = 0;


            while(round <= numberOfRounds && !quitSelected){
                Move userMove = UserDialogs.getUserMove();
                if(userMove == Move.QUIT)
                    quitSelected = true;
                if(!quitSelected){
                    Move computerMove = Comp.getComputerMove();
                    Winner winner = Comp.calculateScore(userMove, computerMove);
                    if(winner == Winner.PLAYER){
                        userScore++;
                    }else if(winner == Winner.COMPUTER){
                        computerScore++;
                    }else{
                        userScore++;
                        computerScore++;
                    }
                    System.out.println("Computer move: " + computerMove + "\nYour move: " + userMove);
                    System.out.println("Computer score: " + computerScore + "\nYour score: " + userScore);
                }
                round++;
            }

            if(userScore > computerScore){
                System.out.println("You are the winner!!!!");
            }else if(userScore < computerScore){
                System.out.println("You've lost :( ");
            }else{
                System.out.println("It's a tie!!");
            }
            decision = UserDialogs.repeatGame();

        }while(decision.equals("y") || decision.equals("Y"));
    }
}

