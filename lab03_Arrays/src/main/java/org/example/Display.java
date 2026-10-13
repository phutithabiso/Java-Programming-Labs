package org.example;

public class Display {
    //display the main page
    public static void display() {
        IO.println("Enter 1:  Display the total and average.");
        IO.println("Enter 2: To find the largest value, smallest value, and number of elements.");
        IO.println("Enter 3:");
        IO.println("Enter 4: ");
    }
    //display   for student marks
    static void students() {
        StudentMarks stu = new StudentMarks();
        stu.students();
    }
     //display for array statistics
    static void runStatistics(){
        ArrayStatistics arr = new ArrayStatistics();
        arr.statistics();
    }
}
