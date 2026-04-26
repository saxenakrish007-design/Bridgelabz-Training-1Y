package com.gla.Regular_Expression;
    import java.util.Scanner;

    public class Username {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = sc.nextLine();
            String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

            if (username.matches(pattern)) {
                System.out.println("Valid Username");
            } else {
                System.out.println("Invalid Username");
            }
        }
    }
