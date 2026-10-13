package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Display dis = new Display();
        dis.qq();
        IO.println("Select Option o display ");
        int a = Integer.parseInt(IO.readln());

        if (a == 1) {
            dis.runPassedSud();
        } else if (a == 2) {
            dis.runGrade();
        } else if (a == 3) {
            dis.runNumeric();
        }else if(a== 4){
            dis.runLogin();
        } else {
            IO.println("Invaild Number");
        }
    }

}
