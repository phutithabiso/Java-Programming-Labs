package org.example;


public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            IO.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            IO.println("Insufficient funds.");
        } else {
            balance -= amount;
            IO.println("Withdrawal successful.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
