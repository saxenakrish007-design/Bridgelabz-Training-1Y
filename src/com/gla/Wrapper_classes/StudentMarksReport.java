package com.gla.Wrapper_classes;
import java.util.*;
public class StudentMarksReport {

    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.equals("null")) {
                        validMarks.add(Integer.parseInt(str));
                    }
                } else if (obj instanceof Integer) {
                    validMarks.add((Integer) obj);
                }
            } catch (NumberFormatException e) {
            }
        }

        int sum = 0;
        int count = 0;

        for (Integer mark : validMarks) {
            sum += mark;
            count++;
        }

        double average = count == 0 ? 0.0 : (double) sum / count;

        System.out.println("Average Marks = " + average);
    }
}
