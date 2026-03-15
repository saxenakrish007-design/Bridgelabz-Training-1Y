package com.gla.Story_Problems_1;

public class Story_6 {
        String name;
        String phoneNumber;
        public Story_6(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
        public void display() {
            System.out.println(String.format("Name: %s", name));
            System.out.println(String.format("Phone Number: %s", phoneNumber));
            System.out.println("--------------------");
        }
    }
    class BusinessContact extends Story_6 {
        String companyName;
        public BusinessContact(String name, String phoneNumber, String companyName) {
            super(name, phoneNumber);
            this.companyName = companyName;
        }
        @Override
        public void display() {
            System.out.println(String.format("Name: %s", name.toUpperCase()));
            System.out.println(String.format("Phone Number: %s", phoneNumber));
            System.out.println(String.format("Company: %s", companyName));
            System.out.println("--------------------");
        }
    }
    class MobileContactApp {
        public static void main(String[] args) {
            Story_6 c1 = new Story_6("Alice", "9876543210");
            Story_6 c2 = new BusinessContact("Bob", "9123456780", "TechCorp");

            c1.display();
            c2.display();
        }
    }
