package com.gla.Wrapper_classes;
import java.util.*;
public class PerformanceTest {

    public static void main(String[] args) {

        int n = 1000000;

        long start1 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long sum2 = 0;
        for (Integer val : list) {
            sum2 += val;
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Array sum = " + sum1);
        System.out.println("Array time = " + (end1 - start1) + " ms");

        System.out.println("ArrayList sum = " + sum2);
        System.out.println("ArrayList time = " + (end2 - start2) + " ms");
    }
}
