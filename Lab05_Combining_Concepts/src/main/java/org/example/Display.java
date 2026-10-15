package org.example;

public class Display {

    void runStudent() {

        Student s1 = new Student("St10219717", "Moe", new int[]{70, 80, 60});
        Student s2 = new Student("St10219034", "Lethabo", new  int[]{170, 190, 150});
        Student s3 = new Student("St10219002", "neo", new int[]{12, 29, 36});
        Student[] students = {s1, s2, s3} ;

// highet student
        int passed = 0;
        Student highest = students[0];

        for (int i = 0; i < students.length; i++) {
            students[i].desplayDetails();
            if (students[i].hasPassed()) {
                passed++;
            }
            if (students[i].calculateAverage() > highest.calculateAverage()) {
                highest = students[i];
            }
            IO.println("--------------------");
        }
        IO.println("============About Student==============");
        IO.println("Total students: " + students.length);
        IO.println("Students passed: " + passed);
        IO.println("Students failed: " + (students.length - passed));
        IO.println("============Highest Average==============");
        IO.println("Highest average student: " + highest.getName());
        IO.println("Highest average: " + highest.calculateAverage());
        IO.println("***************************************");
    }

}
