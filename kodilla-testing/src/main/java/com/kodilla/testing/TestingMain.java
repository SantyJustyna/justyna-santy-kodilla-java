package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error");
        }

        System.out.println("Calculator testing:");

        SimpleCalculator calculator = new SimpleCalculator(8,4);

        int result1 = calculator.addAtoB();
        int result2 = calculator.subtractAFromB();

        if(result1 == 12){
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }
        if(result2 == -4){
            System.out.println("Test OK");
        }else{
            System.out.println("Error");
            }
    }
}
