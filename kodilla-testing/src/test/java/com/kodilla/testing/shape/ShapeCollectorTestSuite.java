package com.kodilla.testing.shape;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.*;


@DisplayName("TDD: Shape Test Siute")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @Nested
    @DisplayName("Test of adding and removing figure.")
    class TestAddRemove {

        @Test
        void testAddFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector collector = new ShapeCollector(circle);

            //When
            collector.addFigure(circle);


            //Then
            Assertions.assertEquals(1, collector.checkSize());

        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector collector = new ShapeCollector(circle);
            collector.addFigure(circle);

            //When
            collector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, collector.checkSize());
        }
    }

    @Nested
    @DisplayName("Test of getting and showing figure.")
    class TestGetAndShow {

        @Test
        void testGetFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector collector = new ShapeCollector(circle);
            collector.addFigure(circle);

            //When
            Shape retrivedShape = collector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrivedShape);
        }

        @Test
        void testShowFigure() {
            //Given
            Shape circle = new Circle();
            ShapeCollector collector = new ShapeCollector(circle);
            collector.addFigure(circle);

            //When
            String expectedResult = "Circle";

            //Then
            Assertions.assertEquals(expectedResult, collector.showFigures());

        }
    }
}
