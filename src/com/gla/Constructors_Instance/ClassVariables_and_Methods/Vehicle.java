package com.gla.Constructors_Instance.ClassVariables_and_Methods;

public class Vehicle {
        String ownerName;
        String vehicleType;
        static double registrationFee = 5000;
        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }
        void displayVehicleDetails() {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println();
        }
        static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
        public static void main(String[] args) {
            Vehicle v1 = new Vehicle("Rahul", "Car");
            Vehicle v2 = new Vehicle("Aman", "Bike");
            v1.displayVehicleDetails();
            v2.displayVehicleDetails();
            Vehicle.updateRegistrationFee(7000);
            System.out.println("After Updating Registration Fee:\n");
            v1.displayVehicleDetails();
            v2.displayVehicleDetails();
        }
    }
