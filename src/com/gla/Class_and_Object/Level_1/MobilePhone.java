package com.gla.Class_and_Object.Level_1;

public class MobilePhone {
        String brand;
        String model;
        double price;
        void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }
        public static void main(String[] args) {
            MobilePhone phone = new MobilePhone();
            phone.brand = "Samsung";
            phone.model = "Galaxy S23";
            phone.price = 75000;

            phone.displayDetails();
        }
    }
