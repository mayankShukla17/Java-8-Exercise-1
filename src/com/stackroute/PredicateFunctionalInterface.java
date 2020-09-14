package com.stackroute;
/*
Program2
        Problem Statement: Find the list of strings which start with letter I in the given list of
        strings
        **Given a list of strings, find the list of strings which start with letter I in the given strings
        using Predicate Functional Interface **
        **This exercise contains a class named PredicateFunctionalInterface with the following
        method:**
        +findPattern(List<String>) : List<String>
        -Should accept list of strings as input
        -Should find the list of strings which start with letter I in the given strings
        -Should return list of strings which start with letter I in the given strings as output
        -Should return empty list if no such string is found which start with letter I
        -Should avoid the redundancy among the strings in output

        Example
        Sample Input:
        [Icecream,Water,Ice,Gas,Ice]
        Expected Output:
        [Icecream,Ice]

        Sample Input:
        [Java,C,C++,Java,C]
        Expected Output:
        []

        Sample Input:
        []
        Expected Output:
        []
*/

import java.util.*;
import java.util.stream.Stream;

public class PredicateFunctionalInterface {
    // Generic function to convert a list to stream
    private static <T> Stream<T> convertListToStream(List<T> list) {
        return list.stream();
    }

    //Code for finding the pattern
    public static List<String> findPattern(List<String> list) {
        if (list.isEmpty())
            return list;

        Stream<String> stream = convertListToStream(list);
        List<String> list1 = new ArrayList<>();
        stream.filter(string -> string.startsWith("I")).distinct().forEach(list1::add);
        return list1;
    }

    //Main Method Driver Code
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data which you want to add in the list separated by commas.");
        String data = scanner.nextLine();
        String[] dataArray = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(dataArray));
        List<String> result = findPattern(list);
        System.out.println(result);
        System.out.println("Empty List Test Case");
        result = findPattern(Collections.emptyList());
        System.out.println(result);
    }
}
