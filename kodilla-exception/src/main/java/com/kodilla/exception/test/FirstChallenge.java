package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by ZERO not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException a){
            System.out.println(a.getLocalizedMessage());
        }finally {
            System.out.println("First challenge done!");
        }
    }
}
