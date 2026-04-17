package com.gla.Stream_api;
    import java.util.*;
    class Product {
        String name;
        double price;
        double rating;
        double discount;
        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }
        public String toString() {
            return name + " | Price: " + price +
                    " | Rating: " + rating +
                    " | Discount: " + discount + "%";
        }
    }

    class EcommerceSort {
        public static void main(String[] args) {

            List<Product> products = new ArrayList<>();

            products.add(new Product("Laptop", 80000, 4.5, 10));
            products.add(new Product("Phone", 30000, 4.7, 20));
            products.add(new Product("Headphones", 2000, 4.2, 30));
            products.add(new Product("Watch", 5000, 4.0, 15));

            Scanner sc = new Scanner(System.in);

            System.out.println("Sort by (price/rating/discount): ");
            String choice = sc.nextLine().toLowerCase();
            switch (choice) {
                case "price":
                    products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
                    break;
                case "rating":
                    products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating)); // high to low
                    break;
                case "discount":
                    products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount)); // high to low
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSorted Products:");
            for (Product p : products) {
                System.out.println(p);
            }

            sc.close();
        }
    }