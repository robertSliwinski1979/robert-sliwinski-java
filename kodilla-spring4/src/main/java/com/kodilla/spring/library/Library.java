package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {

    private final List<String> books = new ArrayList<>();
    //sposób 3 - poniżesze pole odznaczamy @Autowired
    //@Autowired
    private  LibraryDbController libraryDbController;


//    @Autowired            //sposób 1 -konstruktor
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
       // System.out.println("bbb");
    }
    //sposób 2 - settery
//@Autowired      //setter
//public void setLibraryDbController(LibraryDbController libraryDbController) {
//    this.libraryDbController = libraryDbController;
//}

//@Autowired        // sposób 1 -konstruktor - tylko 1 konstruktor może być oznaczony @Autowired
   public Library() {
//       System.out.println("aaa");
//        LibraryDbController libraryDbController = new LibraryDbController();
//        this.libraryDbController = libraryDbController;
        // do nothing
   }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
