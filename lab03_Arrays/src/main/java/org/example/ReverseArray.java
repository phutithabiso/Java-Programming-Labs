package org.example;

public class ReverseArray {
    static void reverce(int[] num){


        for (int k = num.length - 1; k>=0; k--) {
            IO.println(num[k]);
        }

    }
    static  void normal(int[] num){
        for (int p = 0; p <num.length ; p++) {
            IO.println(num[p]);
        }
    }
}
