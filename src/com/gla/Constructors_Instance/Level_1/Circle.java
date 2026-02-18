package com.gla.Constructors_Instance.Level_1;

public class Circle {
        double radius;
        Circle() {
            this(1.0);
        }
        Circle(double radius) {
            this.radius = radius;
        }
        void displayArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + area);
            System.out.println();
        }
        public static void main(String[] args) {
            Circle c1 = new Circle();
            Circle c2 = new Circle(5);
            c1.displayArea();
            c2.displayArea();
        }
    }