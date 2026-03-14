package com.gla.Interfaces;
interface PaymentProcessor {
    void pay();
    default void refund(){
        System.out.println("Refund processed");
    }
}

class PayPal implements PaymentProcessor {

    public void pay(){
        System.out.println("Payment via PayPal");
    }
}

public class PaymentGatewayApp {

    public static void main(String[] args) {

        PaymentProcessor p = new PayPal();

        p.pay();
        p.refund();
    }
}