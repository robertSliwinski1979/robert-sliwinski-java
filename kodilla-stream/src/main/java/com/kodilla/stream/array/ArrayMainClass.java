package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMainClass implements ArrayOperations {

    public ArrayMainClass(int[] num) {
    }

    public static double getAverage(int[] num) {

        Arrays.stream(num).forEach(s->System.out.println(s));
       // System.out.println(Arrays.stream(num).average().getAsDouble());


        double result = Arrays.stream(num).average().getAsDouble();
        return result;
    }
}
