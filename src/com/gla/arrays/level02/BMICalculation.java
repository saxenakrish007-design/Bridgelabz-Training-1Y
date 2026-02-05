package com.gla.arrays.level02;
import java.util.Scanner;

    public class BMICalculation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();
            double[] weight = new double[n];
            double[] height = new double[n];
            double[] bmi = new double[n];
            String[] status = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details of person " + (i + 1));
                System.out.print("Weight (kg): ");
                weight[i] = sc.nextDouble();
                System.out.print("Height (m): ");
                height[i] = sc.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                bmi[i] = weight[i] / (height[i] * height[i]);
                if (bmi[i] <= 18.4) {
                    status[i] = "Underweight";
                } else if (bmi[i] <= 24.9) {
                    status[i] = "Normal";
                } else if (bmi[i] <= 39.9) {
                    status[i] = "Overweight";
                } else {
                    status[i] = "Obese";
                }
            }
            System.out.println("\n--- BMI Report ---");
            for (int i = 0; i < n; i++) {
                System.out.println("Person " + (i + 1));
                System.out.println("Height: " + height[i] + " m");
                System.out.println("Weight: " + weight[i] + " kg");
                System.out.println("BMI: " + bmi[i]);
                System.out.println("Status: " + status[i]);
                System.out.println();
            }
        }
    }
