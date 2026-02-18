package com.gla.Constructors_Instance.Access_Modifiers;

public class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;
        public void setCGPA(double cgpa) {
            this.CGPA = cgpa;
        }
        public double getCGPA() {
            return CGPA;
        }
    }
    class PostgraduateStudent extends Student {
        void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + getCGPA());
        }
        public static void main(String[] args) {
            PostgraduateStudent pg = new PostgraduateStudent();
            pg.rollNumber = 101;
            pg.name = "Aman";
            pg.setCGPA(8.9);
            pg.displayDetails();
        }
    }
