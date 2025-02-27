package org.lessons.java.bankaccount;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------");

        // Create a new bank account
        BankAccount account1 = new BankAccount(1);

        // Print the balance
        System.out.println("Actual balance: $" + account1.getBalance() );

        // Deposit
        System.out.println("Depositing 100...");
        account1.deposit(100);
        System.out.println("Actual balance: $" + account1.getBalance() );

        // Withdraw
        System.out.println("Withdrawing 50...");
        account1.withdraw(50);
        System.out.println("Actual balance: $" + account1.getBalance() );

        System.out.println("------------------------------------");


    }

}
