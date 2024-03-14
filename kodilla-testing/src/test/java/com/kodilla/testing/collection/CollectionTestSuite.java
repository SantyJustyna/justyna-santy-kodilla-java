package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Collection Test Siute")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Siute: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Siute: end");
    }

    @DisplayName("When collection is empty" + " then exterminate shouldn't return any numbers.")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> input = List.of();
        List<Integer> expected = List.of();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(input);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("When collection contains numbers" + " then exterminate should return even numbers only.")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> input = List.of(14, 5, 4, 7, 8);
        List<Integer> expected = List.of(14, 4, 8);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(input);

        //Then
        Assertions.assertEquals(expected, result);
    }

}
