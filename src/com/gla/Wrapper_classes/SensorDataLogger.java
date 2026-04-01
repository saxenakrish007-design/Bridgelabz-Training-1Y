package com.gla.Wrapper_classes;
import java.util.*;
public class SensorDataLogger {

    public static void main(String[] args) {

        ArrayList<Double> data = new ArrayList<>();

        addTemperature(data, 25.5);
        addTemperature(data, Double.valueOf(30.2));

        for (Double temp : data) {
            double value = temp;
            System.out.println(value);
        }
    }

    public static void addTemperature(ArrayList<Double> data, Double temp) {
        data.add(temp);
    }
}
