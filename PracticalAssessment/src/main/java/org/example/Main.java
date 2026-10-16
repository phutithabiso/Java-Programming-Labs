package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        StoreMethods methods = new StoreMethods();
        boolean run = true;
        while (run) {
            Product[] products = {
                    new Product(101, "Laptop", 8500.00, 5),
                    new Product(102, "Mouse", 150.00, 10),
                    new Product(103, "Keyboard", 350.00, 8),
                    new Product(104, "Headphones", 600.00, 4),
                    new Product(105, "USB Drive", 120.00, 0)
            };

            IO.println("===== CAMPUS STORE =====");
            IO.println("1. Display products");
            IO.println("2. Search product");
            IO.println("3. Exit");

            int choice = Integer.parseInt(IO.readln("Choose an option: "));

            if (choice == 1) {
                methods.displayProducts(products);
            } else if (choice == 2) {
                methods.searchProduct(products);
            } else if (choice == 3) {
                IO.println("Thank you for visiting Campus Store!");
            } else {
                IO.println("Invalid option. Please choose 1, 2, or 3.");
                run = false;
            }
        }
    }
}