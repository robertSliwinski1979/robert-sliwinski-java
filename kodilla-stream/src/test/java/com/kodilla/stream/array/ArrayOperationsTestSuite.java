package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){

        //Given
        int[] num = {1, 7, 3, 2, 34, 12, 67, 12, 66, 45, 12, 11, 87, 99, 11, 99, 44, 34, 22, 100};

        //When
        double expected = 38.4;
        double actual = ArrayMainClass.getAverage(num);

        //Then
        assertEquals(expected,actual);

    }
}
