package com.gla.Encapsulation;
import java.util.*;
public class BankingSystemApp {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("ACC101","Krishna",50000);
        BankAccount a2 = new CurrentAccount("ACC102","Rahul",30000);

        List<BankAccount> accounts = Arrays.asList(a1,a2);

        for(BankAccount acc : accounts){

            acc.deposit(2000);
            acc.withdraw(1000);

            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Holder Name: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());

            System.out.println("Interest: " + acc.calculateInterest());

            if(acc instanceof Loanable){
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }

            System.out.println("----------------------");
        }
    }
}

abstract class BankAccount{

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNo,String name,double balance){
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable{

    void applyForLoan();

    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{

    public SavingsAccount(String accNo,String name,double balance){
        super(accNo,name,balance);
    }

    public double calculateInterest(){
        return getBalance()*0.04;
    }

    public void applyForLoan(){
        System.out.println("Loan applied for Savings Account");
    }

    public double calculateLoanEligibility(){
        return getBalance()*2;
    }
}

class CurrentAccount extends BankAccount implements Loanable{

    public CurrentAccount(String accNo,String name,double balance){
        super(accNo,name,balance);
    }

    public double calculateInterest(){
        return getBalance()*0.02;
    }

    public void applyForLoan(){
        System.out.println("Loan applied for Current Account");
    }

    public double calculateLoanEligibility(){
        return getBalance()*1.5;
    }
}

