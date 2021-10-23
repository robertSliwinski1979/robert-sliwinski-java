package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beutify (String wordToBeautify,PoemDecorator poemDecorator){
       String result = poemDecorator.decorate(wordToBeautify);
       return result;
    }
}
