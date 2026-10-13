package org.example;

public class ArrayStatistics {
  static void statistics() {
      int[] num = {89, 34, 69, 77, 95, 94};
      int largest= 0;
      int smallest = num[0];

      for (int i = 0; i < num.length; i++) {
          if (num[i] > largest) {
              largest = num[i];

          }
          if (num[i] < smallest) {
              smallest = num[i];


          }

      }
      IO.println(" Largest Number: " + largest);
      IO.println(" Smallest Number: " + smallest);



  }
}
