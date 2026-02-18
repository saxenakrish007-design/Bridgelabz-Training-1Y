package com.gla.Constructors_Instance.Access_Modifiers;

public class Book {
        public String ISBN;
        protected String title;
        private String author;
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }
    }
    class EBook extends Book {
        void displayBook() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + getAuthor());
        }
        public static void main(String[] args) {
            EBook eb = new EBook();
            eb.ISBN = "12345";
            eb.title = "Java Programming";
            eb.setAuthor("James");

            eb.displayBook();
        }
    }
