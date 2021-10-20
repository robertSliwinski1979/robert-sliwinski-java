package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

@Nested
@DisplayName("TDD: ShapeCollector \uD83D\uDE31")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Shape. This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Shape. All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Shape. Preparing to execute test #" + testCounter);
    }

    @DisplayName("Tests Figure")
    @Test
    void testAddFigure(){

        //GIVEN
        Shape shape1 = new Circle(1);
        ShapeCollector collection = new ShapeCollector(new Circle(1));
        //WHEN
        collection.addFigure(shape1);
        //THEN
        Assertions.assertEquals(1,collection.getFigureQuantity());

    }

    @Test
    void testRemoveFigureNonExisting (){

        //Given
        Shape shape1 = new Square(3);
        ShapeCollector collection1 = new ShapeCollector(new Square(4));
        collection1.addFigure(shape1);
        //When
        boolean result= collection1.removeFigure(shape1); // will generate true
        boolean results= collection1.removeFigure(shape1); // will generate false
        //Then
        Assertions.assertFalse(results);
        Assertions.assertEquals(0,collection1.getFigureQuantity());
    }

    @Test
    void testRemoveFigureExisting (){
        //Given
        Shape shape2 = new Square(1);
        ShapeCollector collection2 = new ShapeCollector(new Square(1));
        collection2.addFigure(shape2);
        //When
        boolean result = collection2.removeFigure(shape2);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,collection2.getFigureQuantity());
    }

    @DisplayName("Tests Show Figures")
    @Test
    void testGetFigure(){
        //Given
        ShapeCollector collection3 = new ShapeCollector(new Square(1));
        //When
        Shape shape1 = new Square(1);
        Shape shape2 = new Circle(5);
        Shape shape3 = new Triangle(4);
        collection3.addFigure(shape1);
        collection3.addFigure(shape2);
        collection3.addFigure(shape3);
        //Then
        collection3.getFigure(2);
    }

    @Test
    void testShowFigures(){
        //Given
        ShapeCollector collection5 = new ShapeCollector(new Square(1));
        Shape shape1 = new Square(1);
        Shape shape2 = new Circle(2);
        Shape shape3 = new Triangle(3);
        Shape shape4 = new Circle(4);
        Shape shape5 = new Triangle(5);

        //When
        collection5.addFigure(shape1);
        collection5.addFigure(shape2);
        collection5.addFigure(shape3);
        collection5.addFigure(shape4);
        collection5.addFigure(shape5);

        //Then
        collection5.showFigures();
    }

}
