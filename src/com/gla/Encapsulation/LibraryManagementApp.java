package com.gla.Encapsulation;
import java.util.*;
public class LibraryManagementApp {
    public static void main(String[] args) {

        LibraryItem i1 = new Book(101,"Java Programming","James Gosling");
        LibraryItem i2 = new Magazine(102,"Tech Monthly","Editor Team");
        LibraryItem i3 = new DVD(103,"Inception","Christopher Nolan");

        List<LibraryItem> items = Arrays.asList(i1,i2,i3);

        for(LibraryItem item : items){

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if(item instanceof Reservable){
                Reservable r = (Reservable)item;
                r.reserveItem();
                System.out.println("Availability: " + r.checkAvailability());
            }

            System.out.println("---------------------");
        }
    }
}

abstract class LibraryItem{

    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id,String title,String author){
        this.itemId=id;
        this.title=title;
        this.author=author;
    }

    public void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable{

    void reserveItem();

    String checkAvailability();
}

class Book extends LibraryItem implements Reservable{

    private boolean available = true;

    public Book(int id,String title,String author){
        super(id,title,author);
    }

    public int getLoanDuration(){
        return 14;
    }

    public void reserveItem(){
        available=false;
        System.out.println("Book Reserved");
    }

    public String checkAvailability(){
        return available ? "Available" : "Not Available";
    }
}

class Magazine extends LibraryItem implements Reservable{

    private boolean available = true;

    public Magazine(int id,String title,String author){
        super(id,title,author);
    }

    public int getLoanDuration(){
        return 7;
    }

    public void reserveItem(){
        available=false;
        System.out.println("Magazine Reserved");
    }

    public String checkAvailability(){
        return available ? "Available" : "Not Available";
    }
}

class DVD extends LibraryItem implements Reservable{

    private boolean available = true;

    public DVD(int id,String title,String author){
        super(id,title,author);
    }

    public int getLoanDuration(){
        return 5;
    }

    public void reserveItem(){
        available=false;
        System.out.println("DVD Reserved");
    }

    public String checkAvailability(){
        return available ? "Available" : "Not Available";
    }
}

