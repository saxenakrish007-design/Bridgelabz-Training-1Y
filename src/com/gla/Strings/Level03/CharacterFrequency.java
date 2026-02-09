package com.gla.Strings.Level03;
    import java.util.Scanner;
    public class CharacterFrequency {
        static String[][] findFrequency(String text) {
            int[] freq = new int[256];
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                freq[ch]++;
            }
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (freq[text.charAt(i)] != 0) {
                    count++;
                    freq[text.charAt(i)] = 0;
                }
            }
            freq = new int[256];
            for (int i = 0; i < text.length(); i++) {
                freq[text.charAt(i)]++;
            }
            String[][] result = new String[count][2];
            int index = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (freq[ch] != 0) {
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(freq[ch]);
                    index++;
                    freq[ch] = 0;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            String[][] result = findFrequency(text);
            System.out.println("Character\tFrequency");
            System.out.println("------------------------");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }
