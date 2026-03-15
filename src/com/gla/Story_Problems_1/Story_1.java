package com.gla.Story_Problems_1;
class Story_1 {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Central Library";
    public Story_1(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    public double calculateFine(int daysLate) {
        return 0;
    }
    public void displayInfo() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}
class TextBook extends Story_1 {
    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Story_1 {
    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}
class Story{
    public static void main(String[] args) {
        Story_1 b1 = new TextBook(101, "Mathematics", 250);
        Story_1 b2 = new Magazine(201, "National Geographic", 150);

        b1.displayInfo();
        System.out.println("Fine for 3 late days: ₹" + b1.calculateFine(3));
        System.out.println("-----------------------------");
        b2.displayInfo();
        System.out.println("Fine for 3 late days: ₹" + b2.calculateFine(3));
    }
}