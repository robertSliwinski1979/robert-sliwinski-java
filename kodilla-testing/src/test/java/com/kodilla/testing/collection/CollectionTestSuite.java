
package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

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
        OddNumbersExaminator exterminator=new OddNumbersExaminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @DisplayName ("This test checks if collection contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> numbers = List.of(1,5,43,21,66,65,23,21,34,87,77);
        List<Integer> expected = List.of(66,34);
        OddNumbersExaminator exterminator=new OddNumbersExaminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expected,result);
    }
}

