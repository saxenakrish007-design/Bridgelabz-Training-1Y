package com.gla.Strings.Level02;
import java.util.Scanner;
    public class VotingCheck {
        static int[] generateAges(int n) {
            int[] ages = new int[n];
            for (int i = 0; i < n; i++) {
                ages[i] = (int)(Math.random() * 90) + 10; // random 2-digit age
            }
            return ages;
        }
        static String[][] checkVoting(int[] ages) {
            String[][] result = new String[ages.length][2];
            for (int i = 0; i < ages.length; i++) {
                result[i][0] = String.valueOf(ages[i]);
                if (ages[i] < 0) {
                    result[i][1] = "false";
                } else if (ages[i] >= 18) {
                    result[i][1] = "true";
                } else {
                    result[i][1] = "false";
                }
            }
            return result;
        }
        static void display(String[][] data) {
            System.out.println("Age\tCan Vote");
            System.out.println("----------------");
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i][0] + "\t" + data[i][1]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[] ages = generateAges(n);
            String[][] votingResult = checkVoting(ages);
            display(votingResult);
        }
    }
