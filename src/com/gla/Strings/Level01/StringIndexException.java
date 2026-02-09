package com.gla.Strings.Level01;
import java.util.Scanner;
public class StringIndexException {
        static void generateException(String text) {
            System.out.println(text.charAt(text.length()));
        }
        static void handleException(String text) {
            try {
                System.out.println(text.charAt(text.length()));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException handled");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String text = sc.next();
            handleException(text);
        }
    }
