package com.gla.Strings.Level03;
import java.util.Scanner;
    public class BMIProgram {
        static String[][] calculateBMI(double[][] data) {
            String[][] result = new String[data.length][4];
            for (int i = 0; i < data.length; i++) {
                double weight = data[i][0];
                double heightCm = data[i][1];
                double heightM = heightCm / 100;
                double bmi = weight / (heightM * heightM);
                bmi = Math.round(bmi * 100.0) / 100.0;
                String status;
                if (bmi <= 18.4)
                    status = "Underweight";
                else if (bmi <= 24.9)
                    status = "Normal";
                else if (bmi <= 39.9)
                    status = "Overweight";
                else
                    status = "Obese";
                result[i][0] = String.valueOf(heightCm);
                result[i][1] = String.valueOf(weight);
                result[i][2] = String.valueOf(bmi);
                result[i][3] = status;
            }
            return result;
        }
        static void display(String[][] result) {
            System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
            System.out.println("-------------------------------------------------------");
            for (int i = 0; i < result.length; i++) {
                System.out.println((i + 1) + "\t" +
                        result[i][0] + "\t\t" +
                        result[i][1] + "\t\t" +
                        result[i][2] + "\t" +
                        result[i][3]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] data = new double[10][2]; // weight, height
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for Person " + (i + 1));
                System.out.print("Weight (kg): ");
                data[i][0] = sc.nextDouble();
                System.out.print("Height (cm): ");
                data[i][1] = sc.nextDouble();
            }
            String[][] result = calculateBMI(data);
            display(result);
        }
    }
