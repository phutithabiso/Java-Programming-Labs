package org.example;

public class NumberAnalysis {

    // Check whether the number is positive, negative, or zero
    public static void analyzeNumber(int number) {

        if (number > 0) {
            IO.println(number + " is positive");
        } else if (number < 0) {
            IO.println(number + " is negative");
        } else {
            IO.println(number + " is zero");
        }
        // Check whether the number is even or odd
        if (number % 2 == 0) {
            IO.println(number + " is even");
        } else {
            IO.println(number + " is odd");
        }


    }

}
