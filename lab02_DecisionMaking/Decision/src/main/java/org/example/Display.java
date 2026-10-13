package org.example;

public class Display {

    public static void qq(){
        IO.println("enter 1 for Passed or Faild Student ");
        IO.println("enter 2 for To see Passed Student");
    }
    public  static void runPassedSud(){
        IO.println("======================");
        IO.println("Marks Method to check if the student passed");
        IO.println("======================");
        PassOrFail mark= new PassOrFail();
        mark.checkMakrs(72);
        mark.checkMakrs(90);
        mark.checkMakrs(100);
        mark.checkMakrs(89);
        IO.println("========================");
    }
    public static void runGrade(){
        IO.println("=========================");
        IO.println("Pass Rate");
        IO.println("==========================");
        GradeCalculator grade = new GradeCalculator();
        grade.calculator(50);
        grade.calculator(50);
        grade.calculator(50);
        grade.calculator(50);
        grade.calculator(50);

    }
}
