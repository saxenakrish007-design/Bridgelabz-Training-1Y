package com.gla.Encapsulation;
import java.util.*;
public class RideHailingApp {
    public static void main(String[] args) {

        Vehicle v1 = new Car("C101","Amit",15);
        Vehicle v2 = new Bike("B202","Rohit",8);
        Vehicle v3 = new Auto("A303","Suresh",10);

        List<Vehicle> vehicles = Arrays.asList(v1,v2,v3);

        double distance = 10;

        calculateFareForVehicles(vehicles, distance);
    }

    public static void calculateFareForVehicles(List<Vehicle> vehicles, double distance){

        for(Vehicle v : vehicles){

            v.getVehicleDetails();

            double fare = v.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: " + fare);

            if(v instanceof GPS){
                GPS g = (GPS)v;
                g.updateLocation("City Center");
                System.out.println("Current Location: " + g.getCurrentLocation());
            }

            System.out.println("----------------------");
        }
    }
}

abstract class Vehicle{

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id,String driver,double rate){
        this.vehicleId=id;
        this.driverName=driver;
        this.ratePerKm=rate;
    }

    public double getRatePerKm(){
        return ratePerKm;
    }

    public void getVehicleDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
    }

    public abstract double calculateFare(double distance);
}

interface GPS{

    String getCurrentLocation();

    void updateLocation(String location);
}

class Car extends Vehicle implements GPS{

    private String location;

    public Car(String id,String driver,double rate){
        super(id,driver,rate);
    }

    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS{

    private String location;

    public Bike(String id,String driver,double rate){
        super(id,driver,rate);
    }

    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS{

    private String location;

    public Auto(String id,String driver,double rate){
        super(id,driver,rate);
    }

    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}

