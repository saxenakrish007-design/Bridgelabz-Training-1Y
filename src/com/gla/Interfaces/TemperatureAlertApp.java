 package com.gla.Interfaces;
import java.util.function.Predicate;
    public class TemperatureAlertApp {
        public static void main(String[] args) {

            Predicate<Double> alert = temp -> temp > 40;

            double temperature = 45;

            if(alert.test(temperature))
                System.out.println("Temperature crossed threshold!");
            else
                System.out.println("Temperature normal");
        }
    }