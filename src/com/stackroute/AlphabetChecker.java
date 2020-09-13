package com.stackroute;
/*
Program1
        # Problem Statement: Check whether given list of strings contains only alphabets or not
        ##
        **Given a list of strings, check whether each string in list contains only alphabets or not
        using lambda expressions **
        **This exercise contains a class named AlphabetChecker with the following method:**
        +checkAlphabets(List<String>) : String
        -Should accept list of strings as input
        -Should return "Give proper input not empty list" if given list is empty
        -Should check whether given list of strings contains all alphabets as characters or
        not using lambda expressions
        -Should return "Given list contains only alphabet strings" if list contains only
        alphabet strings
        -Should return "Given list contains non alphabet strings" if list contains non
        alphabet strings
        ## Example
        Sample Input:
        [Java,code]
        Expected Output:
        Given list contains only alphabet strings
        --------------------------------------------------------
        Sample Input:
        [Java!!,Code**]
        Expected Output:
        Given list contains non alphabet strings
        --------------------------------------------------------
        Sample Input:
        []
        Expected Output:
        Give proper input not empty list
*/

import java.util.*;

public class AlphabetChecker {
    //Method to check the list of strings
    public static String checkAlphabets(List<String> list) {
        if (list.isEmpty())
            return "Give proper input not empty list";
        boolean result = false;
        for (String s : list) {
            if (isStringOnlyAlphabet(s))
                result = true;
            else
                result = false;
        }
        if (result)
            return "Given list contains only alphabet strings";
        else
            return "Given list contains non alphabet strings";
    }

    //Method to check whether string has only alphabets or not
    public static boolean isStringOnlyAlphabet(String string) {
        return ((string != null) && (!string.equals("")) && (string.matches("^[a-zA-Z]*$")));
    }

    //Main method Driver Code
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data which you want to add in the list separated by commas.");
        String data = scanner.nextLine();
        String[] dataArray = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(dataArray));
        String result = checkAlphabets(list);
        System.out.println(result);
        System.out.println("Empty List Test Case");
        result = checkAlphabets(Collections.emptyList());
        System.out.println(result);
    }
}
