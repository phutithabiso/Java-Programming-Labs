package org.example;

public class ArrayStatistics {
  static void statistics() {
      int[] num = {89, 34, 69, 77, 95, 94};
      int largest = 0;
      int smallest = 0;
      int equal=0;
      for (int i = 0; i < num.length; i++) {
          if (num[i] > largest) {
              largest = num[i];

          }
          if (num[i] < smallest) {
              smallest = num[i];


          } if(num[i]>= 50){
              equal = num[i];
          }
          else {
              IO.println("Invaid");
          }

      }
      IO.println(" Largest Number: " + largest);
      IO.println(" Smallest Number: " + smallest);
      IO.println("how many values are greater than or equal to 50 is:" + equal);


  }
}
