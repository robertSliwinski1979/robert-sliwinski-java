package com.example.kodillaexception;

import com.kodilla.exception.test.Exception;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KodillaExceptionApplicationTests {

    @Test
    void contextLoads() {
    }

// Przenieść -> praca domowa i w dodatku źle

//    @Test
//    void probablyIWillThrowException() {
//        // x >= 2 || x < 1 || y == 1.5
//
//        //given
//        SecondChallenge secondChallenge1 = new SecondChallenge();
//        SecondChallenge secondChallenge2 = new SecondChallenge();
//        SecondChallenge secondChallenge3 = new SecondChallenge();
//        SecondChallenge secondChallenge4 = new SecondChallenge();
//
//        //when
//        //1 good
//        try {
//            String result1 = secondChallenge1.probablyIWillThrowException(1.5, 2.0);
//            System.out.println("result1: " + result1);
//        } catch ( Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception1: " + e.getMessage());
//        }
//
//        //2 y==1.5 thus exception
//        try {
//            String result2 = secondChallenge2.probablyIWillThrowException(1.5, 1.5);
//            System.out.println("result2: " + result2);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception2: " + e.getMessage());
//        }
//
//        //3 x>=2 thus exception
//        try {
//            String result3 = secondChallenge3.probablyIWillThrowException(2.0, 2.0);
//            System.out.println("result3: " + result3);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception3: " + e.getMessage());
//        }
//
//        //4 x<1 thus exception
//        try {
//            String result4 = secondChallenge4.probablyIWillThrowException(0.5, 2.0);
//            System.out.println("result4: " + result4);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception4: " + e.getMessage());
//        }
//
//        //then
//        finally {
//            System.out.println("This will always execute");
//        }
//    }
}
