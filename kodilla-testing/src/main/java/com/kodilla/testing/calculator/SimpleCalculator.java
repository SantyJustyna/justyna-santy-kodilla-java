package com.kodilla.testing.calculator;

public class SimpleCalculator {

    private int a;
    private int b;

    public SimpleCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addAtoB(){
        return a + b;
    }

    public int subtractAFromB(){
        return b - a;
    }
}
