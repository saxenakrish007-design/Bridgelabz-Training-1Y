package com.gla.Generics_Collections;
    import java.util.*;
    public class Main2 {
        public static double sumNumbers(List<? extends Number> list) {
            double sum = 0.0;
            for (Number num : list) {
                sum += num.doubleValue();
            }
            return sum;
        }
        public static void main(String[] args) {
            List<Integer> intList = Arrays.asList(10, 20, 30);
            System.out.println("Sum of Integers: " + sumNumbers(intList));
            List<Double> doubleList = Arrays.asList(5.5, 2.5, 1.0);
            System.out.println("Sum of Doubles: " + sumNumbers(doubleList));
        }
    }

