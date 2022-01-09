package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public final class Display {

    double displayValue(double val) {
        System.out.println("The result from the Display class is " + val);
        return val;
    }
}
