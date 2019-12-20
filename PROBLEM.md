## Problem Statement: String finder using if else ##

**Given 3 Strings find whether second string comes after the first string in the search string**

**This exercise contains a class named StringFinder with the following static method:**

      findString(String,String,String):boolean  
  
- Three input strings are scanned for searchString,firstString and secondString respectively.Function returns true if the secondString comes after after firstString in the searchString. 
- Input Strings can contain alphanumeric character, spaces and special characters
- If the input string is empty/null,or if the strings are not found as expected then false should be returned.

**Do the following in the main method of StringFinder class**

1. Accept 3 Strings from the console
2. Display the content using the findString method as shown in example section
3. Display **Empty or Not found**, if the String is null or empty 

## Example
    Sample Input:
    abcd
    ab
    cd 
    
    Expected Output:
    Found as expected
--------------------------------------------------------
    Sample Input:
    String finder
    finder
    value  
    
    Expected Output:
    Empty or Not found
--------------------------------------------------------
    Sample Input:
    Search value
    first
    start
    
    Expected Output:
    Empty or Not found

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
