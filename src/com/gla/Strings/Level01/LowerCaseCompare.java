package com.gla.Strings.Level01;
import java.util.Scanner;
    public class LowerCaseCompare {
        static String toLowerUsingLogic(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
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
            String lower1 = toLowerUsingLogic(text);
            String lower2 = text.toLowerCase();
            boolean result = compareStrings(lower1, lower2);
            System.out.println("Lowercase using logic: " + lower1);
            System.out.println("Lowercase using toLowerCase(): " + lower2);
            System.out.println("Are both results equal? " + result);
        }
    }
