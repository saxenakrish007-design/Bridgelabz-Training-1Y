package com.gla.Polymorphism;

public class Runner {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int sum1=c1.add(12,13);
        System.out.println(sum1);
        double sum2=c1.add(11.22,12.33);
        System.out.println(sum2);
    }
}
