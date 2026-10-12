package org.example;

/*Create StudentDetails. Declare variables for a student's name (String), age (int),
 average mark (double), and registration status (boolean).
 Assign values  and print a labelled summary.*/
public class StudentDetails {
    static void main() {
        //declare the variable
        String name = "Naledi";
        int age = 20;
         double averageMarks = 76.6;
         boolean status = true;
         // display the output using new modern in java
        IO.println("Student Name: "+ name);
        IO.println("Age: "+ age);
        IO.println("Average Mark: " + averageMarks);
        IO.println("Registered: " + status);
    }
}
