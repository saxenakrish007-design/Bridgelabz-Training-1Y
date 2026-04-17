package com.gla.Stream_api;
    import java.util.*;
import java.util.stream.Collectors;
    class Invoice {
        String transactionId;
        Invoice(String transactionId) {
            this.transactionId = transactionId;
        }
        public String toString() {
            return "Invoice created for Transaction ID: " + transactionId;
        }
    }
     class InvoiceCreation {
        public static void main(String[] args) {
            List<String> transactionIds = Arrays.asList("T101", "T102", "T103");
            List<Invoice> invoices = transactionIds.stream()
                    .map(Invoice::new)
                    .collect(Collectors.toList());
            invoices.forEach(System.out::println);
        }
    }