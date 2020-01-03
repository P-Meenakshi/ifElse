package com.stackroute.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFinderAppTests {
    private static final String FOUND = "Found as expected";
    private static final String NOT_FOUND = "Empty or Not found";
    private static String input = "";
    private static final String messageOne = "Search string is found as expected";
    private static final String messageTwo = "Search string is not found as expected";

    private ByteArrayOutputStream myOutStream;
    private ByteArrayInputStream myInputStream;
    private static final String[] VALID_VALUES = {"string finder", "string", "finder"};
    private static final String[] INVALID_VALUES = {"string finder", "finder", "string"};

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @AfterEach
    public void teardown() {
        myOutStream=null;
    }
    @Test
    public void givenValidValuesWhenCheckedThenDisplayFound() {
        input = VALID_VALUES[0] + "\n" + VALID_VALUES[0] + "\n" + VALID_VALUES[2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(FOUND.toLowerCase().replaceAll("\\s+", ""), actual, messageOne);
    }

    @Test
    public void givenInValidValuesWhenCheckedThenDisplayNotFound() {
        input = INVALID_VALUES[0] + "\n" + INVALID_VALUES[1] + "\n" + INVALID_VALUES[2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(NOT_FOUND.toLowerCase().replaceAll("\\s+", ""), actual, messageTwo);
    }


}
