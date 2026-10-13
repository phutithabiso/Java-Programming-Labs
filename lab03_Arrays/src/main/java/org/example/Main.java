package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Display dis = new Display();
        dis.display();
        IO.println("Select Option to display ");
        int a = Integer.parseInt(IO.readln());
        if (a == 1) {

            dis.students();
        } else if (a == 2) {
            dis.runStatistics();
        } else if (a == 3) {

        } else {
            IO.println("Invaild Number");
        }

    }
}
