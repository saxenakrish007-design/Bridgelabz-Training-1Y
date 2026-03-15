package com.gla.Story_Problems_1;

public class Story_2 {
        int orderId;
        double baseAmount;
        static double deliveryCharge = 40;
        public Story_2(int orderId, double baseAmount) {
            this.orderId = orderId;
            this.baseAmount = baseAmount;
        }
        public double calculateBill() {
            return baseAmount + deliveryCharge;
        }
        public void displayInfo() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Base Amount: ₹" + baseAmount);
            System.out.println("Delivery Charge: ₹" + deliveryCharge);
            System.out.println("Total Bill: ₹" + calculateBill());
            System.out.println("--------------------------");
        }
    }
    class RegularOrder extends Story_2 {
        public RegularOrder(int orderId, double baseAmount) {
            super(orderId, baseAmount);
        }

        @Override
        public double calculateBill() {
            return baseAmount + deliveryCharge;
        }
    }
    class PremiumOrder extends Story_2 {
        public PremiumOrder(int orderId, double baseAmount) {
            super(orderId, baseAmount);
        }
        @Override
        public double calculateBill() {
            double discountedAmount = baseAmount * 0.8; // 20% discount
            return discountedAmount + deliveryCharge;
        }
    }
    class OnlineFoodDeliveryApp {
        public static void main(String[] args) {
            Story_2 o1 = new RegularOrder(101, 250);
            Story_2 o2 = new PremiumOrder(102, 500);
            o1.displayInfo();
            o2.displayInfo();
        }
    }
