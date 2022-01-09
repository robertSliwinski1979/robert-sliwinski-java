package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public final class Calculator {

    @Autowired
    private Display display;

    double add(double a, double b) {
        double result = a + b;
        return display.displayValue(result);
    }

    double sub(double a, double b) {
        double result = a - b;
        return display.displayValue(result);
    }

    double mul(double a, double b) {
        double result = a * b;
        return display.displayValue(result);
    }

    double div(double a, double b) {
        double result = a / b;
        return display.displayValue(result);
    }
}
