package com.gla.Class_and_Object.Level_1;

public class Item {
        int itemCode;
        String itemName;
        double price;
        void displayItem() {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Item: " + price);
        }
        void calculateTotalCost(int quantity) {
            double total = price * quantity;
            System.out.println("Total Cost for " + quantity + " items: " + total);
        }
        public static void main(String[] args) {
            Item it = new Item();
            it.itemCode = 201;
            it.itemName = "Pen";
            it.price = 10;
            it.displayItem();
            it.calculateTotalCost(5);
        }
    }
