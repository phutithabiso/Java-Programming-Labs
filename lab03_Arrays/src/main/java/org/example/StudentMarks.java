package org.example;

public class StudentMarks {

    static void students(){
        //declare array
        int[]marks ={79,67,88,88,90,60};
        int total = 0;
        for (int i = 0; i < marks.length; i++) {

            IO.println("Student " + (i + 1) + ": " + marks[i]);
            total = marks[i];
            // Calculate the average
            double average = total / marks.length;
            //display
            IO.println("Total marks: " + total);
            IO.println("Average mark: " + average);
        }
    }
}
