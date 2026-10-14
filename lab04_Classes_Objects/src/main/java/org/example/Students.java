package org.example;

public class Students {
    String name;
    String studentNumber;
    double mark;

    public Students(String name, String studentNumber, double mark) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }
    public void displayDetails(){
        IO.println("============================");
        IO.println("Student Name: " + name);
        IO.println("Student Number: "+ studentNumber);
        IO.println("Student Mark:" + mark);

    }
    public boolean hasPassed(){
       return mark >= 50;
    }

}
