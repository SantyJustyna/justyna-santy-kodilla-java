package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask(){

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.checkTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //Then
        assertEquals("Driving task", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.checkTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask(){

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.checkTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //Then
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
