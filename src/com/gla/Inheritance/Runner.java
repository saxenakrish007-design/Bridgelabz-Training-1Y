package com.gla.Inheritance;

public class Runner {
    public static void main(String[] args) {
Dog d1=new Dog();
d1.sound();
d1.walk();
        System.out.println("--------------------");
Puppy p1=new Puppy();
p1.look();
p1.walk();
p1.sound();
        System.out.println("---------------------");

        Mammal m1=new Mammal();
        m1.eat();
        System.out.println("---------------------");
        Shark s1=new Shark();
        s1.eat();
        s1.eats();
    }
}
