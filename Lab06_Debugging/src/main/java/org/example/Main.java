package org.example;

import java.text.ParsePosition;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        BankAccount account =
                new BankAccount("Thabiso", "ACC001", 1000.00);

        IO.println("Opening balance: R" + account.getBalance());

        // Test 1: Valid withdrawal
        IO.println("\nTest 1: Withdraw R200");
        account.withdraw(200);
        IO.println("Balance: R" + account.getBalance());

        // Test 2: Zero withdrawal
        IO.println("\nTest 2: Withdraw R0");
        account.withdraw(0);
        IO.println("Balance: R" + account.getBalance());

        // Test 3: Negative withdrawal
        IO.println("\nTest 3: Withdraw -R50");
        account.withdraw(-50);
        IO.println("Balance: R" + account.getBalance());

        // Test 4: More than the balance
        IO.println("\nTest 4: Withdraw R900");
        account.withdraw(900);
        IO.println("Balance: R" + account.getBalance());

        // Test 5: Withdraw the exact remaining balance
        IO.println("\nTest 5: Withdraw R800");
        account.withdraw(800);
        IO.println("Balance: R" + account.getBalance());
    }
}
