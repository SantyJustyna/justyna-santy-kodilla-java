package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity){
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<usersQuantity; i++){
            String name = new String("User" + i);
            usersList.add(name);
        }
        return usersList;

    }

    @Test
    void testCalculateAdvStatisticsWith0Posts() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(2);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);


        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(0, calculator.getAvPostsPerUser());
        Assertions.assertEquals(0, calculator.getAvCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(2);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.1, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(500, calculator.getAvPostsPerUser());
        Assertions.assertEquals(50, calculator.getAvCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsWith0Comments() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(2);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(5, calculator.getAvPostsPerUser());
        Assertions.assertEquals(0, calculator.getAvCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(2);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(5, calculator.getAvPostsPerUser());
        Assertions.assertEquals(10, calculator.getAvCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsMoreThanComments() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(2);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.5, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(10, calculator.getAvPostsPerUser());
        Assertions.assertEquals(5, calculator.getAvCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhithZeroUsers() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(0, calculator.getAvPostsPerUser());
        Assertions.assertEquals(0, calculator.getAvCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWith100Users() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        List<String> sampleList1 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(sampleList1);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, calculator.getAvCommentsPerPost());
        Assertions.assertEquals(0.1, calculator.getAvPostsPerUser());
        Assertions.assertEquals(0.2, calculator.getAvCommentsPerUser());
    }
}
