package com.gla.Exception_Handling;
    import java.util.*;
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }
    class BankAccount {
        double balance;
        BankAccount(double balance) {
            this.balance = balance;
        }

        void withdraw(double amount) throws InsufficientBalanceException {
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public class Q10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            BankAccount account = new BankAccount(1000);

            try {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                account.withdraw(amount);

            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number");

            } finally {
                sc.close();
            }
        }
    }

