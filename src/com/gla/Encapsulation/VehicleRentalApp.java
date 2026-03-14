package com.gla.Encapsulation;

import java.util.*;

public class VehicleRentalApp {

    public static void main(String[] args) {

        RentalVehicle v1 = new RentalCar("UP14AB1234", 2000);
        RentalVehicle v2 = new RentalBike("UP14XY5678", 500);
        RentalVehicle v3 = new RentalTruck("UP14TR9090", 4000);

        List<RentalVehicle> vehicles = Arrays.asList(v1, v2, v3);

        int days = 3;

        for (RentalVehicle v : vehicles) {

            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;

                System.out.println("Insurance: " + ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }

            System.out.println("----------------------");
        }
    }
}

abstract class RentalVehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalVehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {

    double calculateInsurance();

    String getInsuranceDetails();
}

class RentalCar extends RentalVehicle implements Insurable {

    private String insurancePolicyNumber = "CAR123";

    public RentalCar(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

class RentalBike extends RentalVehicle implements Insurable {

    private String insurancePolicyNumber = "BIKE456";

    public RentalBike(String number, double rate) {
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

class RentalTruck extends RentalVehicle implements Insurable {

    private String insurancePolicyNumber = "TRUCK789";

    public RentalTruck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
