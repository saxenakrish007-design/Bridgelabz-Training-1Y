package com.gla.Story_Problems_1;
public class Story_5 {
        int productId;
        String productName;
        public Story_5(int productId, String productName) {
            this.productId = productId;
            this.productName = productName;
        }
        public boolean isMatch(String keyword) {
            return productName.toLowerCase().contains(keyword.toLowerCase());
        }
        public void displayInfo() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
        }
    }
    class ElectronicProduct extends Story_5{
        String brand;
        public ElectronicProduct(int productId, String productName, String brand) {
            super(productId, productName);
            this.brand = brand;
        }
        @Override
        public boolean isMatch(String keyword) {
            keyword = keyword.toLowerCase();
            return productName.toLowerCase().contains(keyword) || brand.toLowerCase().contains(keyword);
        }
        @Override
        public void displayInfo() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Brand: " + brand);
        }
    }
    class ECommerceProductTest {
        public static void main(String[] args) {
            Story_5 p1 = new Story_5(101, "Wooden Chair");
            Story_5 p2 = new ElectronicProduct(201, "Smartphone", "Samsung");
            Story_5 p3 = new ElectronicProduct(202, "Laptop", "Dell");
            Story_5[] products = {p1, p2, p3};
            String keyword = "sam";

            System.out.println("Searching products for keyword: " + keyword);
            for (Story_5 p : products) {
                if (p.isMatch(keyword)) {
                    p.displayInfo();
                    System.out.println("-------------------");
                }
            }
        }
    }
