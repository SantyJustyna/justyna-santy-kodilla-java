package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class RpsRunner {

    private boolean end = false;
    private int tryCounter = 0;
    Random generator = new Random();
    Scanner scanner = new Scanner(System.in);
    private List<Integer> userWins = new ArrayList<>();
    private List<Integer> comWins = new CopyOnWriteArrayList<>();
    int gamesNumber;


    public void run(){

        System.out.println("What's your name?");
        scanner.nextLine();
        System.out.println("Choose the number of winning games please (1-5):");
        int gamesNumber = scanner.nextInt();
        scanner.nextLine();

        while(!end){
            System.out.println(" STONE press 1 \n PAPER press 2 \n SCISSORS press 3 \n To end the game press X \n To start new game press N");
            tryCounter++;
            System.out.println("Game " + tryCounter + ": make your choice please!");
            int userMove = scanner.nextInt();
            scanner.nextLine();
            int comMove = generator.nextInt(3)+1;
            System.out.println(comMove);
            System.out.println(userMove + " : " + comMove);
            if(comMove == 1 || userMove == 1){
                System.out.println("STONE");
            }
            if(comMove == 2 || userMove == 2){
                System.out.println("PAPER");
            }
            if(comMove == 3 || userMove ==3)
                System.out.println("SCISSORS");
            if(comMove == 1 && userMove == 3 || comMove == 2 && userMove == 1 || comMove == 3 && userMove == 2){
                comWins.add(tryCounter);
                System.out.println("You've lost!");
            }
            if(userMove == 1 && comMove == 3 || userMove == 2 && comMove == 1 || userMove == 3 && comMove == 2) {
                userWins.add(tryCounter);
                System.out.println("You've won!!");
            }
            if(userMove == comMove){
                System.out.println("Tie");
                userWins.add(tryCounter);
                comWins.add(tryCounter);
            }
            System.out.println("Your score: " + userWins.size() + ", computer score: " + comWins.size());
            if(userWins.size() == gamesNumber || comWins.size() == gamesNumber){
                end = true;
                
            }
        }
    }
}

