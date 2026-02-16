package com.gla.Level2;
    import java.util.Scanner;

    public class FactorsProgram {

        // Method to find factors and return as array
        public static int[] findFactors(int num) {

            int count = 0;

            // First loop to count factors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            // Initialize array with count size
            int[] factors = new int[count];

            int index = 0;

            // Second loop to store factors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors[index] = i;
                    index++;
                }
            }

            return factors;
        }

        // Method to find sum of factors
        public static int findSum(int[] factors) {
            int sum = 0;
            for (int i = 0; i < factors.length; i++) {
                sum += factors[i];
            }
            return sum;
        }

        // Method to find product of factors
        public static long findProduct(int[] factors) {
            long product = 1;
            for (int i = 0; i < factors.length; i++) {
                product *= factors[i];
            }
            return product;
        }

        // Method to find sum of squares of factors
        public static double findSumOfSquares(int[] factors) {
            double sumSquares = 0;
            for (int i = 0; i < factors.length; i++) {
                sumSquares += Math.pow(factors[i], 2);
            }
            return sumSquares;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Calling method to get factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.println("Factors are:");
            for (int i = 0; i < factors.length; i++) {
                System.out.print(factors[i] + " ");
            }

            System.out.println();

            // Display results
            System.out.println("Sum of factors: " + findSum(factors));
            System.out.println("Product of factors: " + findProduct(factors));
            System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

    }

}
