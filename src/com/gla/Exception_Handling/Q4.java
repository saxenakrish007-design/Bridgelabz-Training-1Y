package com.gla.Exception_Handling;
    import java.util.*;

    public class Q4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Integer[] arr = null;
            try {
                System.out.print("Enter size of array: ");
                int n = sc.nextInt();
                if (n > 0) {
                    arr = new Integer[n];

                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                }
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                System.out.println("Value at index " + index + ": " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            } finally {
                sc.close();
            }
        }
    }
