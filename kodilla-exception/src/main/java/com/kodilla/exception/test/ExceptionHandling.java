package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println(secondChallenge.probablyIWillThrowException(1, 8));
        }catch (Exception e){
            System.out.println("Exception!!!");
        }finally{
            System.out.println("Second challenge done!");
        }
    }
}
