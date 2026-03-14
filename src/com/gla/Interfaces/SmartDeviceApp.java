package com.gla.Interfaces;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {

    public void turnOn(){
        System.out.println("Light ON");
    }

    public void turnOff(){
        System.out.println("Light OFF");
    }
}

class AC implements SmartDevice {

    public void turnOn(){
        System.out.println("AC ON");
    }

    public void turnOff(){
        System.out.println("AC OFF");
    }
}

public class SmartDeviceApp {

    public static void main(String[] args) {

        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();

        d1.turnOn();
        d2.turnOn();
    }
}

