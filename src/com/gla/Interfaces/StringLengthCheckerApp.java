package com.gla.Interfaces;
import java.util.function.Function;
public class StringLengthCheckerApp {
    public static void main(String[] args) {

        Function<String,Integer> length = msg -> msg.length();

        String message = "Hello Java";

        if(length.apply(message) > 10)
            System.out.println("Message exceeds limit");
        else
            System.out.println("Message within limit");
    }
}

