package com.gla.Wrapper_classes;
import java.util.*;
public class ProductRatingsAnalyzer {

    public static void main(String[] args) {

        int[] ratingsArray = {4, 5, 3, 4};

        ArrayList<Integer> ratingsList = new ArrayList<>();
        ratingsList.add(5);
        ratingsList.add(null);
        ratingsList.add(4);
        ratingsList.add(3);

        ArrayList<Integer> combined = new ArrayList<>();

        for (int r : ratingsArray) {
            combined.add(r);
        }

        combined.addAll(ratingsList);

        int sum = 0;
        int count = 0;

        for (Integer r : combined) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        double average = count == 0 ? 0.0 : (double) sum / count;

        System.out.println("Average Rating = " + average);
    }
}
