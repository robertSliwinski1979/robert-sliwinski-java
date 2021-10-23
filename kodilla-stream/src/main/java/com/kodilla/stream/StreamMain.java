package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beutify("Ala",word -> word.toLowerCase()));
        System.out.println(poemBeautifier.beutify("Ala",word -> word.toUpperCase()));
        System.out.println(poemBeautifier.beutify("Ala",word -> word+"_ABC"));
        System.out.println(poemBeautifier.beutify("Ala",word -> "ABC_"+word));




    }
}
