package com.kodilla.rps;

import java.util.Random;

public class Comp {
    public static Move getComputerMove(){
        Random generator = new Random();
        int number = generator.nextInt(100);
        if(number < 33)
            return Move.ROCK;
        else if(number>=33 && number<66)
            return Move.PAPER;
        else
            return Move.SCISSORS;
    }
    public static Winner calculateScore(Move userMove, Move computerMove){
        if(userMove == Move.ROCK){
            if(computerMove == Move.PAPER)
            return Winner.COMPUTER;
            else if(computerMove == Move.SCISSORS)
                return Winner.PLAYER;
            else
                return Winner.TIE;
        }else if(userMove == Move.PAPER){
            if(computerMove == Move.ROCK)
                return Winner.PLAYER;
            else if(computerMove == Move.SCISSORS)
                return Winner.COMPUTER;
            else
                return Winner.TIE;
        }else{
            if(computerMove == Move.PAPER)
                return Winner.PLAYER;
            else if(computerMove == Move.ROCK)
                return Winner.COMPUTER;
            else
                return Winner.TIE;
        }
    }
}
