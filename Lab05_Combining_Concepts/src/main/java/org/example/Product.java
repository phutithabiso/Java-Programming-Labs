package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            IO.println("Price cannot be negative");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            IO.println("Quantity cannot be negative");
        }
    }

    public double calculateLineTotal() {
        return price * quantity;
    }
}
