package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.random.RandomGenerator;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given

        int[] numbers = {1, 4, 5, 6, 7, 12, 45, 12, 3, 4, 6, 9, 76, 6, 9, 1, 2, 3, 3, 4};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(10.9, average);

    }
}
