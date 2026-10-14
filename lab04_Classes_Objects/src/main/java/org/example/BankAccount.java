package org.example;

import java.util.StringTokenizer;

public class BankAccount {
     private String accHolder;
     private String accNo;
     private Double balance;

    public BankAccount(String accHolder,String accNo, Double balance) {
        this.accHolder = accHolder;
        this.accNo =accNo;
        this.balance = balance;
    }

    public String getAccHolder() {
        return accHolder;
    }
   public String  getAccNo(){
        return  accNo;
   }
   public double getBalance(){

        return  balance;
   }
    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;

    }
    public  void setAccNo(String accNo){
        this.accNo = accNo;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        }
    }

}
