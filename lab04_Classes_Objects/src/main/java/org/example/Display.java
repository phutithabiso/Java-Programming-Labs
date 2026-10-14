package org.example;

public class Display {
    //display the main page
    static void display() {
        IO.println("Enter 1:   Student class");
        IO.println("Enter 2:  Bank account");
        IO.println("Enter 3:  Product inventory");
        IO.println("Enter 4: Rectangle");

    }

    static void runstudent() {
        Students s1 = new Students("Thabiso", "ST10219717", 98);
        Students s2 = new Students("Moe", "ST1021982239", 90);
        s1.displayDetails();
        IO.println("Passed: " + s1.hasPassed());
        IO.println("============================");
        s2.displayDetails();
        IO.println("Passed: " + s2.hasPassed());
        IO.println("============================");

    }
// display balance account
    static void runBalance() {
        BankAccount ac = new BankAccount("Phuti", "ACC001", 2000.00);

        // older amount
        IO.println("=====================");
        IO.println("Account Holder: " + ac.getAccHolder());
        IO.println("Account Number: " + ac.getAccNo());
        IO.println("Balance: R" + ac.getBalance());
        IO.println("*********************");
        // Update values using setters
        ac.setAccHolder("Phuti");
        ac.setAccNo("ACC001");
        // diposit
        ac.deposit(1500);
        ac.withdraw(300);
        //Display
        IO.println("=====================");
        IO.println("Current Amount");
        IO.println("=====================");

        IO.println("Updated Sytem");
        IO.println("=====================");
        IO.println("Account Holder: " + ac.getAccHolder());
        IO.println("Account Number: " + ac.getAccNo());
        IO.println("Balance: R" + ac.getBalance());
        IO.println("*********************");


    }
}
