package com.stackroute;
/*
Program3
        Problem Statement: Find Total of a grocery cart including taxes using lambda
        expression
        **Given a Map and Double find total purchase cost including taxes by iterating through
        the Map using lambda expression**
        **This exercise contains a class named CartCheckout with the following method:**
        +billGenerator(Map<String, BigDecimal>, Double) : String
        - Should take a Map and Double as input and return a String as result
        - Should validate the input Map by checking it is empty and return error String if it is empty
        - Should return error String when Map contains null or empty or blank space as a value
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
*/

import java.math.BigDecimal;
import java.util.*;

public class CartCheckout {
    //Method for generating the bill
    public static String billGenerator(Map<String, BigDecimal> products, Double taxPercent) {
        if (products.isEmpty())
            return "The cart Map is empty";
        if (taxPercent < 0)
            return "The taxPercent cannot be negative";
        if (taxPercent == null)
            return "The taxPercent cannot be null";
        BigDecimal sum = BigDecimal.ZERO;
        for (Map.Entry<String, BigDecimal> entry : products.entrySet())
            sum=sum.add(entry.getValue());
        BigDecimal tax=sum.multiply(BigDecimal.valueOf(taxPercent)).divide(BigDecimal.valueOf(100));
        return ""+sum.add(tax);
    }

    //Main Method Driver Code
    public static void main(String[] args){
        Map<String, BigDecimal> products = new HashMap<>();
        products.put("Apple", BigDecimal.valueOf(54));
        products.put("Grapes", BigDecimal.valueOf(36.78));
        products.put("Papaya", BigDecimal.valueOf(27.89));
        products.put("Orange", BigDecimal.valueOf(23.6));
        products.put("Banana", BigDecimal.valueOf(10.2));

        System.out.println("Test Case 1");
        String resultBill = billGenerator(products, 10.5);
        System.out.println(resultBill);

        System.out.println("Test Case 2");
        resultBill = billGenerator(Collections.emptyMap(), 13d);
        System.out.println(resultBill);

        System.out.println("Test Case 3");
        resultBill = billGenerator(products, -2.5);
        System.out.println(resultBill);

        System.out.println("Test Case 4");
        try {
            resultBill = billGenerator(products, null);
        }catch (NullPointerException e){
            System.out.println("The taxPercent cannot be null");
        }
        System.out.println(resultBill);
    }
}
