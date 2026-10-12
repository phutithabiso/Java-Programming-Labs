package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // declare the variable
        String productName = "Nike";
        double unitPrice =1000.00;
        int quantity = 2;
        double total = unitPrice + quantity;

        // display the output using new morden java
        IO.println("===========================");
        IO.println("Product Name: "+ productName);
        IO.println("Unit Price: " + unitPrice);
        IO.println("Quatity: " + quantity);
        IO.println("===========================");
        IO.println("Total: "+ total);
        IO.println("===========================");

    }
}
