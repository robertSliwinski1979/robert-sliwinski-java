package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
        Library clonedLib = null;
        try{
            clonedLib = library1.shallowCopy();
            clonedLib.setName("Coppied library using shallowCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //creating deep copy
        Library deepClonedLib = null;
        try{
            deepClonedLib = library1.deepCopy();
            deepClonedLib.setName("Coppied library using deepCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library1.getBooks().remove(book3);

        //Then
        System.out.println("Creating manually books and library");
        assertEquals(2,library1.getBooks().size());
        System.out.println("shallowCopy");
        assertEquals(2,clonedLib.getBooks().size());
        System.out.println("deepCopy");
        assertEquals(3,deepClonedLib.getBooks().size());

        assertEquals(library1.getBooks().size(),clonedLib.getBooks().size());
        assertNotEquals(clonedLib.getBooks().size(),deepClonedLib.getBooks().size());
    }
}
