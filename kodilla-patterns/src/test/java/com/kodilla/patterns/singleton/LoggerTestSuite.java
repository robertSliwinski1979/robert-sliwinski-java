package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

      //Logger myLog= new Logger();
        private static Logger myLog;

    @BeforeAll
    public static void openSettingsFile() {
        myLog = Logger.LOG;
        System.out.println("Beginning of all tests");
    }

    @AfterAll
    public static void closeSettingsFile() {

        System.out.println("Closing of all tests");
    }

    @Test
    void testGetFileName() {
        //Given
        myLog.log("This is my first log");
        //When
        String name = myLog.getLastLog();
        //Then
        assertEquals("This is my first log",name);

    }
}
