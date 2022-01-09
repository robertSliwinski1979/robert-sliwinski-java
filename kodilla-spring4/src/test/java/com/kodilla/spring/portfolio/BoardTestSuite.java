package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;
    @Autowired
    private TaskList toDoList;

    @Test
    void testReadBoard() {

        //Given
        toDoList.getTasks().add("task nr 1");

        //When
        String s = board.getToDoList().getTasks().get(0);
        // Then.
        Assertions.assertEquals("task nr 1",s);

    }
}
