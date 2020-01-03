package com.stackroute.basics;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringFinderTests {
    private static final String messageOne = "Should return true for valid values";
    private static final String messageTwo = "Should return false for invalid values";
    private static final String messageThree = "Should return false for empty or null values";
    private static StringFinder object;
    private static final String[][] VALID_VALUES = {{"string finder", "string", "finder"}, {"string comes later", "string", "later"}};
    private static final String[][] INVALID_VALUES = {{"string finder", "finder", "string"}, {"string does not comes later", "later", "string"},
            {"string not matching", "string", "value"}};
    private static final String[][] EMPTY_VALUES = {{" ", "finder", "string"}, {"string comes later", " ", "string"},
            {"string", "first", ""}, {"string values", null, null}, {null, null, null}};

    @BeforeEach
    public static void setup() {
        // This methods runs, before running each test case
        // This method is used to initialize the required variables
        object = new StringFinder();
    }

    @AfterEach
    public static void teardown() {
        // This method runs, after running each test case
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    void givenValidValuesWhenCheckedThenSuccess() {
        assertTrue(object.findString(VALID_VALUES[0][0], VALID_VALUES[0][1], VALID_VALUES[0][2]), messageOne);
        assertTrue(object.findString(VALID_VALUES[1][0], VALID_VALUES[1][1], VALID_VALUES[1][2]), messageOne);
    }

    @Test
    void givenInvalidValuesWhenCheckedThenFailure() {
        assertFalse(object.findString(INVALID_VALUES[0][0], INVALID_VALUES[0][1], INVALID_VALUES[0][2]), messageTwo);
        assertFalse(object.findString(INVALID_VALUES[1][0], INVALID_VALUES[1][1], INVALID_VALUES[1][2]), messageTwo);
        assertFalse(object.findString(INVALID_VALUES[2][0], INVALID_VALUES[2][1], INVALID_VALUES[2][2]), messageTwo);
    }

    @Test
    void givenEmptyOrNullValuesWhenCheckedThenFailure() {
        assertFalse(object.findString(EMPTY_VALUES[0][0], EMPTY_VALUES[0][1], EMPTY_VALUES[0][2]), messageThree);
        assertFalse(object.findString(EMPTY_VALUES[1][0], EMPTY_VALUES[1][1], EMPTY_VALUES[1][2]), messageThree);
        assertFalse(object.findString(EMPTY_VALUES[2][0], EMPTY_VALUES[2][1], EMPTY_VALUES[2][2]), messageThree);
        assertFalse(object.findString(EMPTY_VALUES[3][0], EMPTY_VALUES[3][1], EMPTY_VALUES[3][2]), messageThree);
        assertFalse(object.findString(EMPTY_VALUES[4][0], EMPTY_VALUES[4][1], EMPTY_VALUES[4][2]), messageThree);
    }


}


