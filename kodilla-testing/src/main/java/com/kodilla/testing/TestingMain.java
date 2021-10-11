package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        Calculator calc = new Calculator();

        int c = 25;

        if (c == calc.add(10,15)){
            System.out.println("Addition is correct");
        }else {
            System.out.println("Addition failed!");
        }

        int d = 10;

        if (d == calc.subtract(20,10)){
            System.out.println("Subtraction was successful");
        }else{
            System.out.println("Subtraction is wrong!");
        }


    }
}
