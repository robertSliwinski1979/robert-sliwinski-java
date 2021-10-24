package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        System.out.println("Welcome to module7 - Stream");
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
//
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
//        executeSaySomething.process();
//
//        Executor codeToExecute = () -> System.out.println("This is an example text nr2.");//    7
//        processor.execute(codeToExecute);// 8
//
//        Processor processor1 = new Processor();
//        processor1.execute(() -> System.out.println("This is an example text nr3."));
//
//        ExpressionExecutor a1 = new ExpressionExecutor();
//        a1.executeExpression(15.0,15.0,(a,b)->a+b);
//        a1.executeExpression(15.0,15.0,(a,b)->a-b);
//        a1.executeExpression(15.0,15.0,(a,b)->a*b);
//        a1.executeExpression(15.0,15.0,(a,b)->a/b);
//
//        a1.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        a1.executeExpression(1,1,FunctionalCalculator::divideAByB);
//
//        System.out.println("Task to write 7.1");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        System.out.println(poemBeautifier.beutify("Ala",word -> word.toLowerCase()));
//        System.out.println(poemBeautifier.beutify("Ala",word -> word.toUpperCase()));
//        System.out.println(poemBeautifier.beutify("Ala",word -> word+"_ABC"));
//        System.out.println(poemBeautifier.beutify("Ala",word -> "ABC_"+word));
//
//        System.out.println("Using stream to generate even numbers");
//        NumbersGenerator.generateEven(20);
//
//        String s1="javatpoint";
//        System.out.println(s1.substring(2,4));//returns va
//        System.out.println(s1.substring(0,1).toUpperCase()+".");//returns vatpoint

//        People.getList().stream().forEach(System.out::println);
//        System.out.println("\n\t1");
//        People.getList().stream().count();
//        System.out.println("total: "+People.getList().stream().count());
//        System.out.println("\n\t2");
//        People.getList().stream().map(s -> s.toUpperCase()).forEach(System.out::println);//drukuje toUpperCase
//        System.out.println("\n\t3");
//        People.getList().stream().map(String::toUpperCase).forEach(s -> System.out.println(s)); //to samo co wyzej
//        System.out.println("\n\t4");
//        People.getList().stream().filter(s -> s.length()>11).forEach(System.out::println);
//        System.out.println("\n\t5");
//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length()>11)
//                .map(s -> s.substring(0,s.indexOf(' ')+2)+".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication()>2005).forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory
//                .getList().stream()
//                .filter(book -> book.getYearOfPublication()>2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: "+theResultListOfBooks.size());
//        theResultListOfBooks.stream().forEach(System.out::println);

//        System.out.println("Collectors.toMap()");
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        System.out.println("Collectors.joining()");
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);

        Forum newListOfUsers = new Forum();

        Map<Integer, ForumUser> theMapOfUsers = newListOfUsers.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M' && Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() > 20 && forumUser.getNrOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theMapOfUsers.size());
        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
