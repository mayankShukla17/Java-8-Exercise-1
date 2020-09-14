<<<<<<< HEAD
# Java 8 Exercise-1

1. Program1
Problem Statement: Check whether given list of strings contains only alphabets or not
**Given a list of strings, check whether each string in list contains only alphabets or not
using lambda expressions **
**This exercise contains a class named AlphabetChecker with the following method:**

+checkAlphabets(List<String>) : String
- Should accept list of strings as input
- Should return "Give proper input not empty list" if given list is empty
- Should check whether given list of strings contains all alphabets as charcters or
not using lambda expressions
- Should return "Given list contains only alphabet strings" if list contains only
alphabet strings
- Should return "Given list contains non alphabet strings" if list contains non
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
- Should accept list of strings as input
- Should find the list of strings which start with letter I in the given strings
- Should return list of strings which start with letter I in the given strings as output
- Should return empty list if no such string is found which start with letter I
- Should avoid the redundancy among the strings in output

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

3. Program3
Problem Statement: Find Total of a grocery cart including taxes using lambda
expression
**Given a Map and Double find total purchase cost including taxes by iterating through
the Map using lambda expression**
**This exercise contains a class named CartCheckout with the following method:**

+billGenerator(Map<String, BigDecimal>, Double) : String
- Should take a Map and Double as input and return a String as result
- Should validate the input Map by checking it is empty and return error String if it
is empty
- Should return error String when Map contains null or empty or blank space as a
value
- Should return error String when the Double is negative or null

Example
Sample Input:
{Apple=54, Grapes=36.78, Papaya=27.89, Orange=23.6, Banana=10.2}, 10.5
Expected Output:
"168.47935"

Sample Input:
{}, 13
Expected Output:
"The cart Map is empty"

Sample Input:
{Apple=54, Grapes=36.78, Papaya=27.89, Orange=23.6, Banana=10.2}, -2.5
Expected Output:
"The taxPercent cannot be negative"

Sample Input:
{Apple=54, Grapes=36.78, Papaya=27.89, Orange=23.6, Banana=10.2}, null
Expected Output:
"The taxPercent cannot be null"
