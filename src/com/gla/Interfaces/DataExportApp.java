package com.gla.Interfaces;
interface Exportable {
    void exportCSV();
    void exportPDF();

    default void exportToJSON(){
        System.out.println("Exporting data to JSON");
    }
}

class Report implements Exportable {

    public void exportCSV(){
        System.out.println("Exporting CSV");
    }

    public void exportPDF(){
        System.out.println("Exporting PDF");
    }
}

public class DataExportApp {

    public static void main(String[] args) {

        Report r = new Report();

        r.exportCSV();
        r.exportPDF();
        r.exportToJSON();
    }
}