package com.gla.Strings.Level02;
import java.util.Scanner;
 public class StringLength {
        static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (StringIndexOutOfBoundsException e) {
            }
            return count;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String text = sc.next();
            int len1 = findLength(text);
            int len2 = text.length();
            System.out.println("Length using user-defined method: " + len1);
            System.out.println("Length using built-in length(): " + len2);
        }
    }
