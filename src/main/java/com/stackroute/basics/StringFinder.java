package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
       //Get 3 strings from the user
        StringFinder object=new StringFinder();
        String searchString=object.getInput();
        String str1=object.getInput();
        String str2=object.getInput();

        boolean result=object.findString(searchString,str1,str2);

        object.displayResult(result);
    }

    public String getInput()
    {
         return sc.nextLine();
    }

    public void displayResult(boolean result)
    {
        //displays the result
        if(result) {
            System.out.println("Found as expected");
        }
        else {
            System.out.println("Empty or Not found");
        }
    }

    public  boolean findString(String searchString, String str1, String str2) {

        boolean flag=false;
        //check whether the strings are empty or null
        if(searchString==null || str1==null || str2==null || searchString.equals("") || str1.equals("")|| str2.equals("")) {
            return flag;
        }
        //checks whether str1 and str2 are present in serachString
        if (searchString.contains(str1) && searchString.contains(str2)) {
            //checks whether str2 comes after str1 in searchString
            if (searchString.indexOf(str1) < searchString.indexOf(str2)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
