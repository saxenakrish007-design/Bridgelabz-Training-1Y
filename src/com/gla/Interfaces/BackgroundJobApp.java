package com.gla.Interfaces;
public class BackgroundJobApp {
    public static void main(String[] args) {

        Runnable job = () -> System.out.println("Background task running...");

        Thread t = new Thread(job);
        t.start();
    }
}

