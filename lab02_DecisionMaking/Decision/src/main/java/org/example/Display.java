package org.example;

public class Display {

    public static void qq(){
        IO.println("Enter 1: for Passed or Faild Student ");
        IO.println("Enter 2: for To see Passed Student");
        IO.println("Enter 3: Check whether the number is positive, negative, or zero");
        IO.println("Enter 4: Login Check");
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
    public static void runNumeric(){
        //display numeric
        NumberAnalysis num = new NumberAnalysis();
        num.analyzeNumber(2);
        num.analyzeNumber(7);
        num.analyzeNumber(10);
        num.analyzeNumber(-7);
        num.analyzeNumber(-3);
    }
    public static void runLogin(){
        LoginCheck in = new LoginCheck();
       in.login("Thabiso","Password11" );


    }
}
