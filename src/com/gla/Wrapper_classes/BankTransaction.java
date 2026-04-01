package com.gla.Wrapper_classes;
public class BankTransaction {

    public static void main(String[] args) {

        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println(getRemainingLimit(limit1));
        System.out.println(getRemainingLimit(limit2));
    }

    public static double getRemainingLimit(Double limit) {
        if (limit == null) {
            return 0.0;
        }
        return limit;
    }
}
