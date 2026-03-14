package com.gla.Encapsulation;
import java.util.*;
public class FoodDeliveryApp {
    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Butter Masala",200,2);
        FoodItem f2 = new NonVegItem("Chicken Biryani",300,1);

        List<FoodItem> order = Arrays.asList(f1,f2);

        processOrder(order);
    }

    public static void processOrder(List<FoodItem> order){

        for(FoodItem item : order){

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            if(item instanceof Discountable){
                Discountable d = (Discountable)item;
                double discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
                System.out.println("Final Price after Discount: " + (total-discount));
            }

            System.out.println("---------------------");
        }
    }
}

abstract class FoodItem{

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name,double price,int quantity){
        this.itemName=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void getItemDetails(){
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable{

    double applyDiscount();

    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable{

    public VegItem(String name,double price,int quantity){
        super(name,price,quantity);
    }

    public double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }

    public double applyDiscount(){
        return calculateTotalPrice()*0.05;
    }

    public String getDiscountDetails(){
        return "Veg Discount: 5%";
    }
}

class NonVegItem extends FoodItem implements Discountable{

    public NonVegItem(String name,double price,int quantity){
        super(name,price,quantity);
    }

    public double calculateTotalPrice(){
        double extraCharge = 50;
        return (getPrice()*getQuantity()) + extraCharge;
    }

    public double applyDiscount(){
        return calculateTotalPrice()*0.03;
    }

    public String getDiscountDetails(){
        return "Non-Veg Discount: 3%";
    }
}

