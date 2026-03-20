package com.gla.Exception_Handling;
    import java.io.*;

    public class Q1 {
        public static void main(String[] args) {
            try {
                FileReader file = new FileReader("data.txt");
                BufferedReader reader = new BufferedReader(file);

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }
