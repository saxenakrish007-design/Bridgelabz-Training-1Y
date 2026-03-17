package com.gla.Inheritance_Questions;

public class Main_Employee {
    public static void main(String[] args) {

        Employee e1 = new Manager("Krishna", 101, 80000, 5);
        Employee e2 = new Developer("Rahul", 102, 60000, "Java");
        Employee e3 = new Intern("Aman", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}