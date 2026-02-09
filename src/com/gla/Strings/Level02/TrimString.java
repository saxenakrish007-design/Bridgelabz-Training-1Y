package com.gla.Strings.Level02;
import java.util.Scanner;
    public class TrimString{
        static int[] findTrimIndexes(String str) {
            int start = 0;
            int end = str.length() - 1;
            while (start <= end && str.charAt(start) == ' ') {
                start++;
            }
            while (end >= start && str.charAt(end) == ' ') {
                end--;
            }
            return new int[]{start, end};
        }
        static String createSubstring(String str, int start, int end) {
            String result = "";
            for (int i = start; i <= end; i++) {
                result = result + str.charAt(i);
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
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            int[] indexes = findTrimIndexes(text);
            String trimmedText = createSubstring(text, indexes[0], indexes[1]);
            String builtInTrim = text.trim();
            boolean result = compareStrings(trimmedText, builtInTrim);
            System.out.println("Trimmed text (User-defined): '" + trimmedText + "'");
            System.out.println("Trimmed text (Built-in):     '" + builtInTrim + "'");
            System.out.println("Are both results same? " + result);
        }
    }
