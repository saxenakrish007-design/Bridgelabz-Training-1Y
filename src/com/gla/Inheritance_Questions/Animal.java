package com.gla.Inheritance_Questions;
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}