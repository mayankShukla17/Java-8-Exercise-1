# Java 8 Exercise-1

1. Program1
Problem Statement: Check whether given list of strings contains only alphabets or not

**Given a list of strings, check whether each string in list contains only alphabets or not
using lambda expressions **
**This exercise contains a class named AlphabetChecker with the following method:**
+checkAlphabets(List<String>) : String
-Should accept list of strings as input
-Should return "Give proper input not empty list" if given list is empty
-Should check whether given list of strings contains all alphabets as charcters or
not using lambda expressions
-Should return "Given list contains only alphabet strings" if list contains only
alphabet strings
-Should return "Given list contains non alphabet strings" if list contains non
alphabet strings

Example
Sample Input:
[Java,code]
Expected Output:
Given list contains only alphabet strings

Sample Input:
[Java!!,Code**]
Expected Output:
Given list contains non alphabet strings

Sample Input:
[]
Expected Output:
Give proper input not empty list

2. Program2
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