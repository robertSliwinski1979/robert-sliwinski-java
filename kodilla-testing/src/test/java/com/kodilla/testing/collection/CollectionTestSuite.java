
package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTestSuite {

    public static boolean isAnInt (List<Integer> number) {
        int counter =0;
        int num=0;
        for (int i = 0; i < number.size();i++){
            num = number.get(i);
            if (num % 2 == 0) counter++;
            if (num % 2 != 0) counter++;
        }
        if (number.size() == counter) return true;
        return false;
    }

    public static boolean isEvenNum (List<Integer> number) {
        int counter =0;
        int num=0;
        for (int i = 0; i < number.size();i++){
            num = number.get(i);
            if (num % 2 == 0) counter++;
        }
        if (number.size() == counter) return true;
        return false;
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Examinator: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Examinator: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test this program: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test this program: end");
    }

    @DisplayName("This test checks if the list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        List<Integer> numbers = new ArrayList<>();
        //When

        //Then
        Assertions.assertTrue(numbers.isEmpty());
    }

    @DisplayName ("This test checks if collection contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> numbers = new ArrayList<>();

        //When
        Random generator = new Random();
            for (int i = 0;i<20;i++){
                numbers.add(generator.nextInt(50));
            }

        //Then
        Assertions.assertTrue(isAnInt(numbers));
    }

    @DisplayName ("This test checks if collection contains only even numbers")
    @Test
    void testEvenNumbersExterminatorNormalList(){

        //Given
        List <Integer> numbers = new ArrayList<>() ;
        List<Integer> EvenNumbers = new ArrayList<>();

        //When
        for(int i = 0;i<numbers.size();i++){

            if (numbers.get(i) % 2 == 0) EvenNumbers.add(numbers.get(i));
        }

        //Then
        Assertions.assertTrue(isEvenNum(EvenNumbers));
    }
}
/*
  // creating Arrays of String type
            String a[]
                = new String[] { "A", "B", "C", "D" };

            // getting the list view of Array
            List<String> list = Arrays.asList(a);

            // printing the list
            System.out.println("The list is: " + list);
        }

 */
