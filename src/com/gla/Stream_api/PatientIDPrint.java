package com.gla.Stream_api;
    import java.util.*;
    public class PatientIDPrint {
        public static void main(String[] args) {
            List<String> patientIDs = Arrays.asList(
                    "P101", "P102", "P103", "P104"
            );
            patientIDs.forEach(System.out::println);
        }
    }
