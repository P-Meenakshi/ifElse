package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public void StringFinder() {
    }

    public static void main(String[] args) {
        //Get three strings from the user
        StringFinder s = new StringFinder();
        s.getInput();
    }

    public String getInput() {
        String searchS = sc.nextLine();
        String firstS = sc.nextLine();
        String secondS = sc.nextLine();
        int a = findString(searchS, firstS, secondS);
        displayResult(a);

        sc.close();
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if (result == 1) {
            System.out.println("Found as expected");
        }
        else if (result == 0) {
            System.out.println("Not found");
        }
        else if (result == -1) {
            System.out.println("Empty string or null");
        }
    }

    public int findString(String searchString, String firstString, String secondString) {
        if ((searchString == null) || (firstString == null) || secondString == null) {
            return -1;
        } else if ((searchString.isEmpty()) || (firstString.isEmpty()) || (secondString.isEmpty())) {
            return -1;
        } else {
            int ind1=searchString.indexOf(firstString);
            int ind2=searchString.indexOf(secondString);
            if(ind1<ind2&&ind1!=-1 && ind2!=-1) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public void closeScanner() {
        sc.close();
    }
}
