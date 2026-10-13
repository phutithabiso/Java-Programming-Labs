package org.example;

public class ArraySearch {
 static  void search() {
     int[] search = {75, 45, 73, 87, 22, 33};

     int t = 87;
     boolean find = false;

     for (int i = 0; i < search.length; i++) {
         if (search[i] == t) {
             IO.println("Number found  item: " + i);
             find = true;

         }
     }
     if (!find) {
         System.out.println("Number not found.");
     }
 }
}
