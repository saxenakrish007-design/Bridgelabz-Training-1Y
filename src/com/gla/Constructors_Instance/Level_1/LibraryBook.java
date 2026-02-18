package com.gla.Constructors_Instance.Level_1;

public class LibraryBook {
        String title;
        String author;
        double price;
        boolean availability;
        LibraryBook(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.availability = true;
        }
        void borrowBook() {
            if (availability) {
                availability = false;
                System.out.println(title + " has been borrowed.");
            } else {
                System.out.println(title + " is not available.");
            }
        }
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Available: " + availability);
            System.out.println();
        }
        public static void main(String[] args) {
            LibraryBook b = new LibraryBook("Python", "Guido", 400);
            b.display();
            b.borrowBook();
            b.display();
        }
    }
