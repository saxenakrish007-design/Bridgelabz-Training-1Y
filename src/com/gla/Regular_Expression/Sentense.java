package com.gla.Regular_Expression;
    import java.util.*;
    public class Sentense {
        public static void main(String[] args) {
            String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
            String[] words = text.split(" ");
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "");
                if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
                    System.out.print(word + " ");
                }
            }
        }
    }