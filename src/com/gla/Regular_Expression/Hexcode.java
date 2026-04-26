package com.gla.Regular_Expression;
    import java.util.Scanner;
    public class Hexcode {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter hex color: ");
            String color = sc.nextLine();
            String pattern = "^#[0-9a-fA-F]{6}$";
            if (color.matches(pattern)) {
                System.out.println("Valid Hex Color");
            } else {
                System.out.println("Invalid Hex Color");
            }
        }
    }
