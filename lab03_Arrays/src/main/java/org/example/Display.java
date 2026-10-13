package org.example;

public class Display {
    public static void display() {
        IO.println("Enter 1:  display the total and average.");
        IO.println("Enter 2: for To see Passed Student");
        IO.println("Enter 3: Check whether the number is positive, negative, or zero");
        IO.println("Enter 4: Login Check");
    }
    static void students() {
        StudentMarks stu = new StudentMarks();
        stu.students();
    }
}
