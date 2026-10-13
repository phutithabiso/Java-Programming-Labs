package org.example;

public class PassOrFail {
//    If a mark is 50 or higher, display Pass; otherwise, display Fail.
//    Challenge: Reject marks below 0 or above 100.
     static void checkMakrs(int marks){
         if(marks <0 || marks>50){
            IO.println("Marks must be below 0 or above 100");
         } else if (marks >= 50) {
             IO.println("You have passed your Marks");
         }else {
             IO.println("You have Failled your exam");


         }
     }
}
