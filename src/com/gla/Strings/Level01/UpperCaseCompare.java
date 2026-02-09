package com.gla.Strings.Level01;
import java.util.Scanner;
    public class UpperCaseCompare {
        static String toUpperUsingLogic(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32); // ASCII logic
                }
                result = result + ch;
            }
            return result;
        }
        static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length())
                return false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the text: ");
            String text = sc.nextLine();
            String upper1 = toUpperUsingLogic(text);
            String upper2 = text.toUpperCase();
            boolean result = compareStrings(upper1, upper2);
            System.out.println("Uppercase using logic: " + upper1);
            System.out.println("Uppercase using toUpperCase(): " + upper2);
            System.out.println("Are both results equal? " + result);
        }
    }
