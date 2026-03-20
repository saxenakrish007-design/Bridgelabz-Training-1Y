package com.gla.Exception_Handling;
import java.util.*;

public class Q6 {

    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only");

        } finally {
            sc.close();
        }
    }
}
