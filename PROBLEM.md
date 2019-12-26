## Problem Statement: String finder using if else ##

**Given 3 Strings find whether second string comes after the first string in the search string**

**This exercise contains a class named StringFinder with the following methods:**

    getInput():String  
    findString(String,String,String):boolean
    displayResutl():void  

- Three input strings are scanned for searchString,firstString and secondString respectively from the getInput() method  
- findString() method returns true if the secondString comes after after firstString in the searchString.
   - If the input string is empty/null, or if the strings are not found as expected then false should be returned. 
- displayResult() displays the result as shown in example section. Display **Empty or Not found**, if the String is null or empty
- Input Strings can contain alphanumeric character, spaces and special characters

**Do the following in the main method of StringFinder class**

call the functions in the required sequence.  

## Example
    Sample Input:
    abcd
    ab
    cd 
    
    Expected Output:
    Found as expectedhttps://gitlab.stackroute.in/stack_java_cycle1_exercises_assignments/exercise-bt-conditionalstatements-ifelse-solution.git
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
