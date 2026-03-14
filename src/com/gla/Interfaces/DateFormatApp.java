package com.gla.Interfaces;
import java.time.LocalDate;
interface DateFormatter {

    static String formatDate(LocalDate date){
        return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
    }
}

public class DateFormatApp {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Formatted Date: " + DateFormatter.formatDate(today));
    }
}
