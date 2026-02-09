package com.gla.Strings.Level02;
    import java.util.Scanner;
    public class ShortestLongestWord {
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
            String word = "";
            int index = 0;
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
        static int[] findShortestAndLongest(String[][] table) {
            int minIndex = 0;
            int maxIndex = 0;
            for (int i = 1; i < table.length; i++) {
                int len = Integer.parseInt(table[i][1]);
                int minLen = Integer.parseInt(table[minIndex][1]);
                int maxLen = Integer.parseInt(table[maxIndex][1]);
                if (len < minLen)
                    minIndex = i;
                if (len > maxLen)
                    maxIndex = i;
            }
            return new int[]{minIndex, maxIndex};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the text: ");
            String text = sc.nextLine();
            String[] words = splitIntoWords(text);
            String[][] table = wordLengthTable(words);
            int[] result = findShortestAndLongest(table);
            System.out.println("\nShortest word: " + table[result[0]][0]);
            System.out.println("Longest word: " + table[result[1]][0]);
        }
    }
