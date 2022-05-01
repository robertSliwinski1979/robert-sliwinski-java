package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {



        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5,2);
            System.out.println("result: "+result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }

}
