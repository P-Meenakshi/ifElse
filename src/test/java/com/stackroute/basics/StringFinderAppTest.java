package com.stackroute.basics;

import com.stackroute.basics.StringFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFinderAppTest {
    private static final String FOUND="Found as expected";
    private static final String NOTFOUND="Empty or Not found";
    private static  String input="";
    private static final String MSG_01="Search string is found as expected";
    private static final String MSG_02="Search string is not found as expected";
    private static final String MSG_03="String is empty or null";
    private ByteArrayOutputStream myOutStream;
    private ByteArrayInputStream myInputStream;
    private static final String[] VALIDVALUES = {"string finder","string","finder"};
    private static final String[] INVALIDVALUES = {"string finder","finder","string"};
    private static final String[] EMPTYVALUES = {null,null,null};;
    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @Test
    public void givenValidValuesWhenCheckedThenDisplayFound() {
        input=VALIDVALUES[0]+"\n"+VALIDVALUES[0]+"\n"+VALIDVALUES[2]+"\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(FOUND.toLowerCase().replaceAll("\\s+", ""),actual,MSG_01);
    }

    @Test
    public void givenInValidValuesWhenCheckedThenDisplayNotFound() {
        input=INVALIDVALUES[0]+"\n"+INVALIDVALUES[1]+"\n"+INVALIDVALUES[2]+"\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(NOTFOUND.toLowerCase().replaceAll("\\s+", ""),actual,MSG_02);
    }
    @Test
    public void givenEmptyValuesWhenCheckedThenDisplayEmptyOrNotNull() {
        input=EMPTYVALUES[0]+"\n"+EMPTYVALUES[1]+"\n"+EMPTYVALUES[2]+"\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(NOTFOUND.toLowerCase().replaceAll("\\s+", ""),actual,MSG_03);
    }

}
