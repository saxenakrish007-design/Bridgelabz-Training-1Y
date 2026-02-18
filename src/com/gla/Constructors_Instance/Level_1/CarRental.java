package com.gla.Constructors_Instance.Level_1;

public class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double costPerDay = 2000;
        CarRental() {
            customerName = "Unknown";
            carModel = "Standard";
            rentalDays = 1;
        }
        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }
        double calculateTotalCost() {
            return rentalDays * costPerDay;
        }
        void display() {
            System.out.println("Customer: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: " + calculateTotalCost());
            System.out.println();
        }
        public static void main(String[] args) {
            CarRental c1 = new CarRental();
            CarRental c2 = new CarRental("Rahul", "SUV", 3);
            c1.display();
            c2.display();
        }
    }
