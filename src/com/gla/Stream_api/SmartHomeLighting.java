package com.gla.Stream_api;
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    @FunctionalInterface
    interface LightAction {
        void execute();
    }
    public class SmartHomeLighting {
        public static void main(String[] args) {
            Map<String, LightAction> triggers = new HashMap<>();
            triggers.put("motion", () ->
                    System.out.println("Motion detected → Lights ON (Bright White)")
            );
            triggers.put("morning", () ->
                    System.out.println("Morning → Lights ON (Soft Warm)")
            );
            triggers.put("evening", () ->
                    System.out.println("Evening → Lights DIM (Warm Yellow)")
            );
            triggers.put("night", () ->
                    System.out.println("Night → Lights OFF")
            );
            triggers.put("voice", () ->
                    System.out.println("Voice Command → Party Mode (Colorful Lights)")
            );
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter trigger (motion/morning/evening/night/voice): ");
            String input = sc.nextLine().toLowerCase();
            if (triggers.containsKey(input)) {
                triggers.get(input).execute();
            } else {
                System.out.println("Invalid trigger!");
            }
            sc.close();
        }
    }
