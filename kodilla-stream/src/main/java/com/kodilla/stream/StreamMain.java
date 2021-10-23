package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Welcome to module7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        executeSaySomething.process();

        Executor codeToExecute = () -> System.out.println("This is an example text nr2.");//    7
        processor.execute(codeToExecute);// 8

        Processor processor1 = new Processor();
        processor1.execute(() -> System.out.println("This is an example text nr3."));

        ExpressionExecutor a1 = new ExpressionExecutor();
        a1.executeExpression(15.0,15.0,(a,b)->a+b);
        a1.executeExpression(15.0,15.0,(a,b)->a-b);
        a1.executeExpression(15.0,15.0,(a,b)->a*b);
        a1.executeExpression(15.0,15.0,(a,b)->a/b);

        a1.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        a1.executeExpression(1,1,FunctionalCalculator::divideAByB);

        System.out.println("Task to write 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beutify("Ala",word -> word.toLowerCase()));
        System.out.println(poemBeautifier.beutify("Ala",word -> word.toUpperCase()));
        System.out.println(poemBeautifier.beutify("Ala",word -> word+"_ABC"));
        System.out.println(poemBeautifier.beutify("Ala",word -> "ABC_"+word));

        System.out.println("Using stream to generate even numbers");
        NumbersGenerator.generateEven(20);




    }
}
