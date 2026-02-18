package com.gla.Constructors_Instance.Access_Modifiers;

public class BankAccount {
        public int accountNumber;
        protected String accountHolder;
        private double balance;
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public double getBalance() {
            return balance;
        }
    }
    class SavingsAccount extends BankAccount {
        void displayAccount() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + getBalance());
        }
        public static void main(String[] args) {
            SavingsAccount sa = new SavingsAccount();
            sa.accountNumber = 98765;
            sa.accountHolder = "Rahul";
            sa.setBalance(15000);
            sa.displayAccount();
        }
    }
