package org.lessons.java.bankaccount;

public class BankAccount {
    private int accountNumber;
    private int balance = 0;

    // Constructor
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
