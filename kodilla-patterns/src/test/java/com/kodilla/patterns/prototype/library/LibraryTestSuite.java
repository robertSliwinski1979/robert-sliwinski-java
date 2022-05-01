package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given

        //creating books
        Book book1 = new Book("Horror1","Al Capone", LocalDate.of(1950,1,1));
        Book book2 = new Book("Horror2","Al Pacino", LocalDate.of(1960,6,1));
        Book book3 = new Book("Horror3","Al Smith", LocalDate.of(1955,9,1));

        //creating library
        Library library1 = new Library("horrorsSection");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        //creating shallow copy
        Library shallowClonedLib = null;
        try{
            shallowClonedLib = library1.shallowCopy();
            shallowClonedLib.setName("Copied library using shallowCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //creating deep copy
        Library deepClonedLib = null;
        try{
            deepClonedLib = library1.deepCopy();
            deepClonedLib.setName("Copied library using deepCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //creating copy of the books manually
//        Book book4 = new Book(book1.getTitle(), book1.getAuthor(),book1.getPublicationDate());
//        Book book5 = new Book(book2.getTitle(), book2.getAuthor(),book2.getPublicationDate());
//        Book book6 = new Book(book3.getTitle(), book3.getAuthor(),book3.getPublicationDate());

        //creating copy of the book using collection
        Set<Book> newCopyOfTheBooks = library1.getBooks();
//        newCopyOfTheBooks.add(book4);
//        newCopyOfTheBooks.add(book5);
//        newCopyOfTheBooks.add(book6);
//        newCopyOfTheBooks.add(new Book(book1.getTitle(), book1.getAuthor(),book1.getPublicationDate()));
//        newCopyOfTheBooks.add(new Book(book2.getTitle(), book2.getAuthor(),book2.getPublicationDate()));
//        newCopyOfTheBooks.add(new Book(book3.getTitle(), book3.getAuthor(),book3.getPublicationDate()));

//        System.out.println("This is copy of the books. Beginning");
//        System.out.println(newCopyOfTheBooks);
//        System.out.println("Size of this set is: "+newCopyOfTheBooks.size());
//        System.out.println("This is copy of the books. End");
        System.out.println("1.Size of this set is: "+newCopyOfTheBooks.size());
        //When
        library1.getBooks().remove(book3);
        System.out.println("2.Size of this set is: "+newCopyOfTheBooks.size());
        System.out.println("Library1 size is: "+library1.getBooks().size());
        System.out.println("Creating manually books and library");

        //Then
        assertEquals(2,library1.getBooks().size());   //error when I am adding new books to the other library
        System.out.println("shallowCopy");
        assertEquals(2,shallowClonedLib.getBooks().size());   //error this same as above
        System.out.println("deepCopy");
        assertEquals(3,deepClonedLib.getBooks().size()); // no error

        assertEquals(library1.getBooks().size(),shallowClonedLib.getBooks().size());
        assertNotEquals(shallowClonedLib.getBooks().size(),deepClonedLib.getBooks().size());
    }
}
