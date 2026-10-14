package org.example;

public class Display {
    //display the main page
    public static void display() {
        IO.println("Enter 1:   Store student marks");
        IO.println("Enter 2:  Highest and lowest valuesj");
        IO.println("Enter 3: Search the  Array");
        IO.println("Enter 4: Count the even and odd values in an integer array");
        IO.println("Enter 5: Reverse an Array");
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
    static  void runsearch(){
        ArraySearch src = new ArraySearch();
       src.searchArr();
    }
    static void  runCountOdd(){
        EvenOddArray even = new EvenOddArray();
        int[] num={1,2,3,4,5,6,7,8,9};
        int result = even.countOdd(num);
        int rslt = even.countEven(num);
        IO.println("Odd Numbers: "+ result);
        IO.println("Even Numbers: "+ rslt);
    }
}
