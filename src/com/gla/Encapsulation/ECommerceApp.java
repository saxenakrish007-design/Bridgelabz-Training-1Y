package com.gla.Encapsulation;
import java.util.*;
    public class ECommerceApp {
        public static void main(String[] args) {
            Product p1 = new Electronics(101,"Laptop",60000);
            Product p2 = new Clothing(102,"TShirt",1000);
            Product p3 = new Groceries(103,"Rice",500);
            List<Product> products = Arrays.asList(p1,p2,p3);
            for(Product p : products){
                System.out.println("Product: " + p.getName());
                System.out.println("Final Price: " + p.calculateFinalPrice());
                System.out.println("----------------");
            }
        }
    }
    abstract class Product {
        private int productId;
        private String name;
        private double price;
        public Product(int id,String name,double price){
            this.productId=id;
            this.name=name;
            this.price=price;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public abstract double calculateDiscount();
        public double calculateFinalPrice(){
            return price - calculateDiscount();
        }
    }
    class Electronics extends Product{
        public Electronics(int id,String name,double price){
            super(id,name,price);
        }

        public double calculateDiscount(){
            return getPrice()*0.10;
        }
    }

    class Clothing extends Product{

        public Clothing(int id,String name,double price){
            super(id,name,price);
        }

        public double calculateDiscount(){
            return getPrice()*0.15;
        }
    }

    class Groceries extends Product{

        public Groceries(int id,String name,double price){
            super(id,name,price);
        }

        public double calculateDiscount(){
            return getPrice()*0.05;
        }
    }

