package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classloader = getClass().getClassLoader();
        File file = new File(classloader.getResource("names.txt").getFile());
        //Path path = Paths.get(file.getPath());
        //Path path = Paths.get("tego-pliku-nie-ma.txt");  // ->make error just to see how it works

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            //Stream<String> fileLines = Files.lines(path);     ->put in try + (change path)
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        }finally {
            System.out.println("I am gonna be here... always!");
        }

    }
}