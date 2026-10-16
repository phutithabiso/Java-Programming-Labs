package org.example;

public class Product {


    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name,
                   double price, int stockQuantity) {

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public boolean sell(int quantity) {

        if (quantity <= 0) {
            return false;
        }

        if (quantity > stockQuantity) {
            return false;
        }

        stockQuantity -= quantity;

        return true;
    }

    public void displayDetails() {

        IO.println("ID: " + productId);
        IO.println("Name: " + name);
        IO.println("Price: R" + price);
        IO.println("Stock: " + stockQuantity);
        IO.println("-------------------------");
    }
}
