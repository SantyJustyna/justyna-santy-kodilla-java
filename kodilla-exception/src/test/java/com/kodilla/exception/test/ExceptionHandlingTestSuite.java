package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTestSuite {

    @Test
    void testProbablyIWillThrowExceptionFirstBorderCase(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(1, 8));
        }catch (Exception e){
            System.out.println("Exception!!");
        }finally{
            System.out.println("Second challenge done!");
        }

        //when & then
        assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1, 8));
    }

    @Test
    void testProbablyIWillThrowExceptionSecondBorderCase(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(0.99, 8));
        }catch (Exception e){
            System.out.println("Exception!!");
        }finally{
            System.out.println("Second challenge done!");
        }

        //when & then
        assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(0.99, 8));
    }

    @Test
    void testProbablyIWillThrowExceptionThirdBorderCase() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 1.51));
        } catch (Exception e) {
            System.out.println("Exception!!");
        } finally {
            System.out.println("Second challenge done!");
        }

        //when & then
        assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.5, 1.51));
    }

    @Test
    void testProbablyIWillThrowExceptionFourthBorderCase() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2, 8));
        } catch (Exception e) {
            System.out.println("Exception!!");
        } finally {
            System.out.println("Second challenge done!");
        }

        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 8));
    }

    @Test
    void testProbablyIWillThrowExceptionFifthBorderCase() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.01, 8));
        } catch (Exception e) {
            System.out.println("Exception!!");
        } finally {
            System.out.println("Second challenge done!");
        }

        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.01, 8));
    }

    @Test
    void testProbablyIWillThrowExceptionSixthBorderCase() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.2, 1.5));
        } catch (Exception e) {
            System.out.println("Exception!!");
        } finally {
            System.out.println("Second challenge done!");
        }

        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.2, 1.5));
    }
}
