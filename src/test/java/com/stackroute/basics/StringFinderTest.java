package com.stackroute.basics;

import com.stackroute.basics.StringFinder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringFinderTest {
    private static final String MSG_01 = "Should return true for valid values";
    private static final String MSG_02 = "Should return false for invalid values";
    private static final String MSG_03 = "Should return false for empty or null values";
    private static StringFinder object;
    private static final String[][] VALIDVALUES = {{"string finder","string","finder"}, {"string comes later","string","later"}};
    private static final String[][] INVALIDVALUES = {{"string finder","finder","string"}, {"string does not comes later","later","string"},
            {"string not matching","string","value"}};
    private static final String[][] EMPTYVALUES = {{" ","finder","string"}, {"string comes later"," ","string"},
            {"string","first",""}, {"string values",null,null},{null,null,null}};

    @BeforeAll
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        object = new StringFinder();
    }

    @AfterAll
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    void givenValidValuesWhenCheckedThenSuccess() {
        assertTrue(object.findString(VALIDVALUES[0][0], VALIDVALUES[0][1], VALIDVALUES[0][2]), MSG_01);
        assertTrue(object.findString(VALIDVALUES[1][0], VALIDVALUES[1][1], VALIDVALUES[1][2]), MSG_01);
    }

    @Test
    void givenInValidValuesWhenCheckedThenFailure() {
        assertFalse(object.findString(INVALIDVALUES[0][0], INVALIDVALUES[0][1], INVALIDVALUES[0][2]), MSG_02);
        assertFalse(object.findString(INVALIDVALUES[1][0], INVALIDVALUES[1][1], INVALIDVALUES[1][2]), MSG_02);
        assertFalse(object.findString(INVALIDVALUES[2][0], INVALIDVALUES[2][1], INVALIDVALUES[2][2]), MSG_02);
    }

    @Test
    void givenEmptyOrNullValuesWhenCheckedThenFailure() {
        assertFalse(object.findString(EMPTYVALUES[0][0], EMPTYVALUES[0][1], EMPTYVALUES[0][2]), MSG_03);
        assertFalse(object.findString(EMPTYVALUES[1][0], EMPTYVALUES[1][1], EMPTYVALUES[1][2]), MSG_03);
        assertFalse(object.findString(EMPTYVALUES[2][0], EMPTYVALUES[2][1], EMPTYVALUES[2][2]), MSG_03);
        assertFalse(object.findString(EMPTYVALUES[3][0], EMPTYVALUES[3][1], EMPTYVALUES[3][2]), MSG_03);
        assertFalse(object.findString(EMPTYVALUES[4][0], EMPTYVALUES[4][1], EMPTYVALUES[4][2]), MSG_03);
    }





}


