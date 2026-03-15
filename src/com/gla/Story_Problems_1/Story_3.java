package com.gla.Story_Problems_1;
public class Story_3 {
        int accountNumber;
        double balance;
        static String bankName = "Global Bank";
        public Story_3(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public double calculateInterest() {
            return 0;
        }
        public void displayInfo() {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("Interest: ₹" + calculateInterest());
            System.out.println("-----------------------------");
        }
    }
    class SavingsAccount extends Story_3 {
        public SavingsAccount(int accountNumber, double balance) {
            super(accountNumber, balance);
        }
        @Override
        public double calculateInterest() {
            return balance * 0.04;
        }
    }
    class CurrentAccount extends Story_3 {
        public CurrentAccount(int accountNumber, double balance) {
            super(accountNumber, balance);
        }
        @Override
        public double calculateInterest() {
            return balance * 0.02; // 2% interest
        }
    }
    class BankInterestCalculator {
        public static void main(String[] args) {
            Story_3 a1 = new SavingsAccount(1001, 50000);
            Story_3 a2 = new CurrentAccount(2001, 75000);
            a1.displayInfo();
            a2.displayInfo();
        }
    }

