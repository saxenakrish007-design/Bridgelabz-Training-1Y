package com.gla.Level3;
    import java.util.Random;

    public class FootballTeamHeights {

        // Method to find sum
        public static int findSum(int[] heights) {
            int sum = 0;
            for (int i = 0; i < heights.length; i++) {
                sum += heights[i];
            }
            return sum;
        }

        // Method to find mean
        public static double findMean(int[] heights) {
            int sum = findSum(heights);
            return (double) sum / heights.length;
        }

        // Method to find shortest height
        public static int findShortest(int[] heights) {
            int min = heights[0];
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] < min) {
                    min = heights[i];
                }
            }
            return min;
        }

        // Method to find tallest height
        public static int findTallest(int[] heights) {
            int max = heights[0];
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] > max) {
                    max = heights[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {

            Random random = new Random();

            // Create array of size 11
            int[] heights = new int[11];

            // Generate random heights between 150 and 250 cms
            for (int i = 0; i < heights.length; i++) {
                heights[i] = 150 + random.nextInt(101); // 150 to 250
            }

            // Display heights
            System.out.println("Heights of players:");
            for (int i = 0; i < heights.length; i++) {
                System.out.print(heights[i] + " ");
            }

            System.out.println("\n");

            // Display results
            System.out.println("Sum of heights: " + findSum(heights));
            System.out.println("Mean height: " + findMean(heights));
            System.out.println("Shortest height: " + findShortest(heights));
            System.out.println("Tallest height: " + findTallest(heights));
        }
    }