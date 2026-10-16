package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Display dis = new Display();
        boolean run = true;
        while (run) {
            IO.println("""
               ========= Menu============
               1. Student results system
               2. Mini point-of-sale system
               3. Employee salary review
               """);

            int choice = Integer.parseInt(IO.readln("Choose an option: "));
            if (choice == 1) {
                dis.runStudent();
            } else if (choice == 2) {

            } else if (choice == 3) {

            } else {
                IO.println("Invaild Number");

                run = false;
            }

        }
    }
}
