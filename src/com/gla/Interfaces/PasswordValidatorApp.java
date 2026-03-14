package com.gla.Interfaces;
interface SecurityUtils {
    static boolean isStrongPassword(String password){
        return password.length() >= 8;
    }
}

public class PasswordValidatorApp {

    public static void main(String[] args) {

        String password = "abcd1234";

        if(SecurityUtils.isStrongPassword(password))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}