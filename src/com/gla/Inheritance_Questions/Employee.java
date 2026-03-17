package com.gla.Inheritance_Questions;
    class Employee {
        String name;
        int id;
        double salary;
        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }
    class Manager extends Employee {
        int teamSize;

        Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
            System.out.println("----------------------");
        }
    }
    class Developer extends Employee {
        String programmingLanguage;
        Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + programmingLanguage);
            System.out.println("----------------------");
        }
    }
    class Intern extends Employee {
        int duration;
        Intern(String name, int id, double salary, int duration) {
            super(name, id, salary);
            this.duration = duration;
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Internship Duration: " + duration + " months");
            System.out.println("----------------------");
        }
    }


