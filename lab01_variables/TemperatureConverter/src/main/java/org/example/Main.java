package org.example;


public class Main {
    static void main() {
        //declare variables
        int celsius = 54;
        // Convert Fahrenheit to cersius
        int fahrenheit = (celsius * 9 / 5) + 32;
        int FahrenheitBack  = (fahrenheit - 32) * 5 / 9;
        // Convert Fahrenheit back to Celsius
        IO.println("fahrenheit: "  + fahrenheit);
        IO.println(" Convert Fahreheint back:" + FahrenheitBack );

    }
}
