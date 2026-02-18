package com.gla.Constructors_Instance.ClassVariables_and_Methods;

public class Product {
        String productName;
        double price;
        static int totalProducts = 0;
        Product(String name, double price) {
            this.productName = name;
            this.price = price;
            totalProducts++;
        }
        void displayProductDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println();
        }
        static void displayTotalProducts() {
            System.out.println("Total Products Created: " + totalProducts);
        }
        public static void main(String[] args) {
            Product p1 = new Product("Laptop", 55000);
            Product p2 = new Product("Mobile", 20000);
            p1.displayProductDetails();
            p2.displayProductDetails();
            Product.displayTotalProducts();
        }
    }
