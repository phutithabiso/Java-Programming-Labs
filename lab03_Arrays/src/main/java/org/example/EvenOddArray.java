package org.example;

public class EvenOddArray {
    static int countOdd(int[] num) {

        int count = 0;

        for (int j = 0; j < num.length; j++) {
            if (num[j] % 2 != 0) {
                count++;
            }
        }

            return count;
        }
     static int countEven(int[] num){
        int count = 0;
         for (int l = 0; l < num.length; l++) {
             if (num[l]% 2 == 0){
                 count++;
             }

         }
         return  count;
     }
}
