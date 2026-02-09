package com.gla.Strings.Level02;
    import java.util.Scanner;
    public class SplitTextCompare {
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
        static String[] splitUsingLogic(String text) {
            int len = findLength(text);
            int wordCount = 1;
            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ')
                    wordCount++;
            }
            int[] spaceIndex = new int[wordCount + 1];
            int idx = 0;
            spaceIndex[idx++] = -1;
            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ')
                    spaceIndex[idx++] = i;
            }
            spaceIndex[idx] = len;
            String[] words = new String[wordCount];
            for (int i = 0; i < wordCount; i++) {
                String word = "";
                for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                    word = word + text.charAt(j);
                }
                words[i] = word;
            }
            return words;
        }
        static boolean compareArrays(String[] a1, String[] a2) {
            if (a1.length != a2.length)
                return false;
            for (int i = 0; i < a1.length; i++) {
                if (!a1[i].equals(a2[i]))
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the text: ");
            String text = sc.nextLine();
            String[] arr1 = splitUsingLogic(text);
            String[] arr2 = text.split(" ");
            boolean result = compareArrays(arr1, arr2);
            System.out.println("Are both word arrays equal? " + result);
        }
    }
