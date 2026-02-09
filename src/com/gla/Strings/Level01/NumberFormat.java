package com.gla.Strings.Level01;
import java.util.Scanner;
    public class NumberFormat {
        static void generateException(String text) {
            int num = Integer.parseInt(text);
            System.out.println(num);
        }
        static void handleException(String text) {
            try {
                int num = Integer.parseInt(text);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException handled");
            } catch (RuntimeException e) {
                System.out.println("Generic RuntimeException handled");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value: ");
            String text = sc.next();
            handleException(text);
        }
    }
