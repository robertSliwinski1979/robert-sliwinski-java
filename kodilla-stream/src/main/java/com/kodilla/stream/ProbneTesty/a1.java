package com.kodilla.stream.ProbneTesty;
import java.util.*;
import java.lang.*;
import java.io.*;

class Book{
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object o){
        Book e = (Book)o;
        return (this.author.equals(e.author)) && (this.title.equals(e.title));
    }

    @Override
    public int hashCode(){
        return author.hashCode();
    }

    public String toString(){
        return author + " wrote " + title;
    }

}

class SignatureNumber{
    private String signatureNum;

    public SignatureNumber(String signatureNum){
        this.signatureNum = signatureNum;
    }

    public String toString(){
        return signatureNum ;
    }

    @Override     //Ciekawostka
    public boolean equals(Object o){
        SignatureNumber e = (SignatureNumber) o;
        return (this.signatureNum.equals(e.signatureNum));
    }

    @Override
    public int hashCode(){
        return signatureNum.hashCode();
    }
}

class Kodilla
{
    public static void main (String[] args) throws java.lang.Exception
    {

        List<Book> myBooks1 = new LinkedList<Book>();

        for(int i =0;i<1000000;i++){
            myBooks1.add(new Book("Author"+i,"Title"+i));
        }

        // Deleting last element from the collection
        System.out.println("LinkedList");
        System.out.println("Elements: "+myBooks1.size());

        long begin = System.nanoTime();
        Book b = new Book("Author1000000","Title1000000");
        myBooks1.remove(b);
        long end = System.nanoTime();
        System.out.print("Removal the last element was: "+(end-begin)+" ns.");
        System.out.print("\tElements: "+myBooks1.size()+"\n");

        // Deleting first element from the collection
        long begin1 = System.nanoTime();
        Book c = new Book("Author0","Title0");
        myBooks1.remove(c);
        long end1 = System.nanoTime();
        System.out.print("Removal the first element was: "+(end1-begin1)+" ns.");
        System.out.print("\tElements: "+myBooks1.size()+"\n");

        // Adding first element from the collection
        long begin2 = System.nanoTime();
        myBooks1.add(0,new Book ("abc","cde"));
        long end2 = System.nanoTime();
        System.out.print("Adding the first element was: "+(end2-begin2)+" ns.");
        System.out.print("\tElements: "+myBooks1.size()+"\n");

        // Adding last element from the collection
        long begin3 = System.nanoTime();
        myBooks1.add((myBooks1.size()), new Book("evrerv","ergvegv"));
        long end3 = System.nanoTime();
        System.out.print("Adding the last element was: "+(end3-begin3)+" ns.");
        System.out.print("\tElements: "+myBooks1.size()+"\n");


        System.out.println("\nHashMap");

        List<SignatureNumber> myNum1 = new LinkedList<SignatureNumber>();
        //List<SignatureNumber> myNum1 = new ArrayList<>();
        int n = 10;
        for(int i =0;i<n;i++){
            myNum1.add(new SignatureNumber("Signature number"+i));
        }

        Map<SignatureNumber, Book> newCollection = new HashMap<SignatureNumber, Book>();

        for(int i=0;i<n;i++){
            newCollection.put(myNum1.get(i), myBooks1.get(i));
        }

        System.out.println("Size of map is: "+ newCollection.size());

        //To działa
        for (Map.Entry<SignatureNumber,Book> entry: newCollection.entrySet()){
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }


        System.out.println("dojechałem tutaj");

        // To już nie działa
        for (Map.Entry<SignatureNumber,Book> entry: newCollection.entrySet()){
            if(entry.getKey().equals("Signature number5")){
                System.out.println("Znalazłem");
                System.out.println(entry.getKey()+" --- "+entry.getValue());
                System.out.println("I found the key and value");
            }
        }

        System.out.println("end2");
        // long begin4 = System.nanoTime();
        // Map<SignatureNumber, Book> newCollection3 = new HashMap<SignatureNumber, Book>();
        // newCollection3.put(new SignatureNumber("Signature number ","45"), new Book("abc1","cdes2"));
        // long end4 = System.nanoTime();
        // System.out.println("new one is: "+newCollection3);
        // System.out.println("Adding element to the HashMap took: "+(end4-begin4)+" ns");

    }
}