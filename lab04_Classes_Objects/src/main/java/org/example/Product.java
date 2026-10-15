package org.example;

public class Product {


    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayDetails() {
        IO.println("=== PRODUCT DETAILS ===");
        IO.println("ID: " + productId);
        IO.println("Name: " + name);
        IO.println("Price: R" + price);
        IO.println("Quantity: " + stockQuantity);
        IO.println("Stock Value: R" + calculateStockValue());
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            IO.println("The stock is successfully added to the product.");
        } else {
            IO.println("Invalid stock quantity");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity <= 0) {
            IO.println("Quantity must be greater than zero.");
        } else if (quantity > stockQuantity) {
            IO.println("Required quantity is to be greater than stock quantity.");
        } else if (quantity == stockQuantity) {
            stockQuantity = 0;
            IO.println("Stock has been successfully sold.");
        } else {
            stockQuantity -= quantity;
            IO.println("Sale completed successfully.");
        }
    }

    public double calculateStockValue() {
        return price * stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}

