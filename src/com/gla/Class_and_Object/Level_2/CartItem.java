package com.gla.Class_and_Object.Level_2;

public class CartItem {
        String itemName;
        double price;
        int quantity;
        void addItem(String name, double cost, int qty) {
            itemName = name;
            price = cost;
            quantity = qty;
            System.out.println("Item Added to Cart!");
        }
        void removeItem() {
            quantity = 0;
            System.out.println("Item Removed from Cart!");
        }
        void displayTotalCost() {
            double total = price * quantity;
            System.out.println("Total Cost: " + total);
        }
        public static void main(String[] args) {
            CartItem cart = new CartItem();
            cart.addItem("Shoes", 1500, 2);
            cart.displayTotalCost();
            cart.removeItem();
            cart.displayTotalCost();
        }
    }
