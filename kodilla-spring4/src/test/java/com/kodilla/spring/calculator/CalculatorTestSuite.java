package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given

        //When
        double resultAdd = 6;
        double resultSub = 4.5;
        double resultMul = 65.0;
        double resultDiv = 3.5;


        //Then
        assertEquals(resultAdd, calculator.add(2.5, 3.5));
        assertEquals(resultSub, calculator.sub(7.5, 3));
        assertEquals(resultMul, calculator.mul(6.5, 10));
        assertEquals(resultDiv, calculator.div(24.5, 7));
    }
}
