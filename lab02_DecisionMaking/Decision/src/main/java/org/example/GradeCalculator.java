package org.example;

public class GradeCalculator {
//    Mark Grade
//
//80--100 Distinction 70--79 Merit 50--69 Pass 0--49 Fail Outside 0--100 Invalid mark
//
//    Order conditions correctly so each mark receives one result.
    static void calculator( int mark){
      if(mark <0 || mark> 100){
          IO.println("Mark: " + mark + " Invalid mark");
      } else if (mark >= 80) {
        IO.println("Mark:" + mark + "Distinction");
      } else if (mark>=70 ) {
          IO.println("Mark:" + mark +" Merit");
      } else if (mark >= 50) {
          IO.println("Mark: " + mark + " Pass");

      } else if (mark >= 0) {
          IO.println("Mark: "+ mark + " fail");
      }
      else {
          IO.println("You must repeat");
      }
    }
}
