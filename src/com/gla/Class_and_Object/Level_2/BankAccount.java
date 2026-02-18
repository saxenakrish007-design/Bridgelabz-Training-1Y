package com.gla.Class_and_Object.Level_2;

public class BankAccount {
        String accountHolder;
        int accountNumber;
        double balance;
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
        void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }
        public static void main(String[] args) {
            BankAccount acc = new BankAccount();
            acc.accountHolder = "Rahul";
            acc.accountNumber = 12345;
            acc.balance = 10000;
            acc.deposit(2000);
            acc.withdraw(5000);
            acc.displayBalance();
        }
    }
