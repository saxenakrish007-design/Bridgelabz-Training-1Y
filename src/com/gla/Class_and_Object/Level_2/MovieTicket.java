package com.gla.Class_and_Object.Level_2;

public class MovieTicket {
        String movieName;
        int seatNumber;
        double price;
        void bookTicket(String name, int seat, double cost) {
            movieName = name;
            seatNumber = seat;
            price = cost;
            System.out.println("Ticket Booked Successfully!");
        }
        void displayTicket() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
        public static void main(String[] args) {
            MovieTicket ticket = new MovieTicket();
            ticket.bookTicket("Avengers", 15, 250);

            ticket.displayTicket();
        }
    }
