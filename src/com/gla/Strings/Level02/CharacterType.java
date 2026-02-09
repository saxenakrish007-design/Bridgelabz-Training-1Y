package com.gla.Strings.Level02;
    import java.util.Scanner;
    public class CharacterType {
        static String checkChar(char ch) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    return "Vowel";
                } else {
                    return "Consonant";
                }
            }
            return "Not a Letter";
        }
        static String[][] findCharTypes(String text) {
            String[][] result = new String[text.length()][2];
            for (int i = 0; i < text.length(); i++) {
                result[i][0] = String.valueOf(text.charAt(i));
                result[i][1] = checkChar(text.charAt(i));
            }
            return result;
        }
        static void displayTable(String[][] data) {
            System.out.println("Character\tType");
            System.out.println("-----------------------");
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i][0] + "\t\t" + data[i][1]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            String[][] output = findCharTypes(text);
            displayTable(output);
        }
    }
