package com.gla.Constructors_Instance.ClassVariables_and_Methods;

public class Course {
        String courseName;
        int duration;
        double fee;
        static String instituteName = "ABC Institute";
        Course(String name, int duration, double fee) {
            this.courseName = name;
            this.duration = duration;
            this.fee = fee;
        }
        void displayCourseDetails() {
            System.out.println("Institute: " + instituteName);
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " months");
            System.out.println("Fee: " + fee);
            System.out.println();
        }
        static void updateInstituteName(String newName) {
            instituteName = newName;
        }
        public static void main(String[] args) {
            Course c1 = new Course("Java", 6, 15000);
            Course c2 = new Course("Python", 4, 12000);
            c1.displayCourseDetails();
            c2.displayCourseDetails();
            Course.updateInstituteName("XYZ Academy");
            System.out.println("After Updating Institute Name:\n");
            c1.displayCourseDetails();
            c2.displayCourseDetails();
        }
    }

