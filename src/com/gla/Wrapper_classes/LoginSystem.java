package com.gla.Wrapper_classes;
import java.util.*;
public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(validateAge(input));
    }

    public static boolean validateAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
