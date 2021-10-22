package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "libraryDatabase=" + libraryDatabase +
                '}';
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 41) return bookList;
        bookList = resultList;
        return bookList;
    }


    public Map<Book, LibraryUser> listBooksInHandsOf( Book book,LibraryUser libraryUser){
        Map<Book, LibraryUser> booksOfUser = new HashMap<>();
        booksOfUser.put(book, libraryUser);

        return booksOfUser;
    }
}
