package org.example;

public class StoreMethods {

    // Display all products
    public void displayProducts(Product[] products) {

        IO.println("===== CAMPUS STORE PRODUCTS =====");

        for (int i = 0; i < products.length; i++) {
            products[i].displayDetails();
        }
    }

    // Search for a product by name
    public void searchProduct(Product[] products) {

        String searchName = IO.readln("Enter product name: ");
        boolean found = false;

        for (int i = 0; i < products.length; i++) {

            if (products[i].getName().equalsIgnoreCase(searchName)) {
                products[i].displayDetails();
                found = true;
            }
        }

        if (!found) {
            IO.println("Product not found.");
        }
    }

    // Find a product by ID and return its array index
    public int findProductIndex(Product[] products, int productId) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].getProductId() == productId) {
                return i;
            }
        }

        return -1;
    }
}