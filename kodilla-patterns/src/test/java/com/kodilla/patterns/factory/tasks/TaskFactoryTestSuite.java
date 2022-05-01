package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){

        //Given
        TaskFactory shopping = new TaskFactory();

        //When
        Task a1=shopping.MakeTask("ShoppingTask");
        a1.executeTask();

        //Then
        assertEquals(true,a1.isTaskExecuted());
        assertEquals("purchase, has been executed",a1.getTaskName());

    }

    @Test
    void testFactoryPainingTask(){
        //Given
        TaskFactory painting = new TaskFactory();

        //When
        Task a2=painting.MakeTask("PaintingTask");
        a2.executeTask();

        //Then
        assertEquals(true,a2.isTaskExecuted());
        assertEquals("painting room, has been executed",a2.getTaskName());
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory driving = new TaskFactory();

        //When
        Task a3=driving.MakeTask("DrivingTask");
        a3.executeTask();

        //Then
        assertEquals(true,a3.isTaskExecuted());
        assertEquals("driving, has been executed",a3.getTaskName());
    }
}
