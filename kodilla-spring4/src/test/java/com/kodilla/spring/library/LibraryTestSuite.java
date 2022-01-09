package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    //używanie @Autowired w testach
    @Autowired
    private Library library;

    @Test
    public void testLoadFromDb() {
        //Given
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    //    @Test
//    void testLoadFromDb() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library = context.getBean(Library.class);
//
//        //When
//        library.loadFromDb();
//
//        //Then
//        //do nothing
//    }
//
//    @Test
//    void testSaveToDb() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library = context.getBean(Library.class);
//
//        //When
//        library.saveToDb();
//
//        //Then
//        //do nothing
//    }

    //test ponizej działa bez adnotacji @Autowired powyżej
    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    void testContext1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When & Then
        System.out.println("===== Beans list: ==== >>");

        String [] tab = context.getBeanDefinitionNames();   // [1 sposob]
       for(int i=0;i< tab.length;i++){                      //
           System.out.println(tab[i]);                      //
       }
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //[2 sposob]
        System.out.println("<< ===== Beans list ====");
    }
}