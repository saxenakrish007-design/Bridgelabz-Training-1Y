package com.gla.Regular_Expression;
    import java.util.Scanner;
    public class License{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter license plate: ");
            String plate = sc.nextLine();

            String pattern = "^[A-Z]{2}[0-9]{4}$";

            if (plate.matches(pattern)) {
                System.out.println("Valid License Plate");
            } else {
                System.out.println("Invalid License Plate");
            }
        }
    }
