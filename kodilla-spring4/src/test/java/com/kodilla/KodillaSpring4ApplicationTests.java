package com.kodilla;

import com.kodilla.spring.shape.Circle;     //niepotrzebne dla [2]
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;     //niepotrzebne dla [2]
import com.kodilla.spring.shape.Triangle;       //niepotrzebne dla [2]
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpring4ApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {

        //Given
        //context -> tworzymy kontener i przechowywujemy go
        //tworzenie beanow za pomoca nazwy klasy[1] lub za pomoca nazwy beana[2]
        // w [2] tworzony jest obiekt typu Object, więc potrzebujemy rzutowania
        // czyli (Shape)context.getBean("createSquare");    ->(Shape)
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Shape shape = context.getBean(Circle.class);  //[1]
        Shape shape = (Shape)context.getBean("circle"); //[2]

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        //Shape shape = context.getBean(Triangle.class);    //[1]
        Shape shape = (Shape)context.getBean("triangle");       //[2]

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);

    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Shape shape = context.getBean(Square.class);      //[1]
        Shape shape = (Shape)context.getBean("createSquare");   //[2]

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }
//    @Test
//    void contextLoads() {
//    }
}
