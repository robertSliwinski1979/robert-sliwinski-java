package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMainClass implements ArrayOperations {

    public ArrayMainClass(int[] num) {
    }

    public static double getAverage(int[] num) {
        // IntStream.range(0, num.length).filter(num::toString).forEach(s->System.out.println(s));
       // IntStream.range(0, num.length).map(s -> s).forEach(s -> System.out.println(s));
        System.out.println("druk1");
//        IntStream.range(0, num.length).forEach(s->System.out.println(s));
      //???  IntStream.range(0, num.length).filter(s[i]->i+1)
        //IntStream.range(0, N).forEach(this::doSomething)
        System.out.println("druk2");
        System.out.println(IntStream.range(0, num.length).average().getAsDouble());

        // double result = IntStream.range(0, num.length).average().getAsDouble();
        double result = Arrays.stream(num).average().getAsDouble();
        return result;
    }
}
