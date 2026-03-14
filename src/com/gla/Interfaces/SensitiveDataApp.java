package com.gla.Interfaces;
interface SensitiveData {}
class UserData implements SensitiveData {
    String name = "Krishna";
}
class SecurityManager {

    static void check(Object obj){

        if(obj instanceof SensitiveData)
            System.out.println("Encrypt this data");
        else
            System.out.println("Normal data");
    }
}

public class SensitiveDataApp {

    public static void main(String[] args) {

        UserData data = new UserData();

        SecurityManager.check(data);
    }
}
