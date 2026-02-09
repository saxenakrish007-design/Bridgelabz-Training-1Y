package com.gla.Strings.Level02;
    import java.util.Scanner;
    public class WordsWithLength {
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
        static String[] splitIntoWords(String text) {
            int len = findLength(text);
            int wordCount = 1;
            for (int i = 0; i < len; i++) {
                if (text.charAt(i) == ' ')
                    wordCount++;
            }
            String[] words = new String[wordCount];
            int index = 0;
            String word = "";
            for (int i = 0; i < len; i++) {
                if (text.charAt(i) != ' ') {
                    word = word + text.charAt(i);
                } else {
                    words[index++] = word;
                    word = "";
                }
            }
            words[index] = word;
            return words;
        }
        static String[][] wordLengthTable(String[] words) {
            String[][] table = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                table[i][0] = words[i];
                table[i][1] = String.valueOf(findLength(words[i]));
            }
            return table;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the text: ");
            String text = sc.nextLine();
            String[] words = splitIntoWords(text);
            String[][] result = wordLengthTable(words);
            System.out.println("\nWord\tLength");
            for (int i = 0; i < result.length; i++) {
                int len = Integer.parseInt(result[i][1]);
                System.out.println(result[i][0] + "\t" + len);
            }
        }
    }
