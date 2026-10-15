package org.example;

public class Rectangle {
    private int width ;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = width;
    }
   void displayDetails(){
        IO.println("Wight: "+ width);
        IO.println("Height: " + height);
   }

    public int getArea() {
        return width * height;
    }

    public int getDiamention() {
        return 2 * (width + height);
    }
}
