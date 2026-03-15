package com.gla.Story_Problems_1;
public class Story_8 {
        int courseId;
        String courseName;
        double price;
        static String platformName = "LearnOnline";
        public Story_8(int courseId, String courseName, double price) {
            this.courseId = courseId;
            this.courseName = toTitleCase(courseName); // Convert name to Title Case
            this.price = price;
        }
        public double getFinalPrice() {
            return price;
        }
        protected String toTitleCase(String str) {
            if (str == null || str.isEmpty()) return str;
            String[] words = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                if (w.length() > 0) {
                    sb.append(Character.toUpperCase(w.charAt(0)));
                    if (w.length() > 1) sb.append(w.substring(1).toLowerCase());
                    sb.append(" ");
                }
            }
            return sb.toString().trim();
        }
        public void displayCourseInfo() {
            System.out.println("Platform: " + platformName);
            System.out.println("Course ID: " + courseId);
            System.out.println("Course Name: " + courseName);
            System.out.println("Original Price: ₹" + price);
            System.out.println("Final Price: ₹" + getFinalPrice());
            System.out.println("----------------------------");
        }
    }
    class RecordedCourse extends Story_8 {

        public RecordedCourse(int courseId, String courseName, double price) {
            super(courseId, courseName, price);
        }

        @Override
        public double getFinalPrice() {
            return price * 0.9; // 10% discount
        }
    }
    class LiveCourse extends Story_8 {

        public LiveCourse(int courseId, String courseName, double price) {
            super(courseId, courseName, price);
        }

        @Override
        public double getFinalPrice() {
            return price * 0.95;
        }
    }
    class OnlineLearningPlatform {
        public static void main(String[] args) {
            Story_8 c1 = new RecordedCourse(101, "java programming basics", 2000);
            Story_8 c2 = new LiveCourse(102, "advanced python programming", 3500);
            c1.displayCourseInfo();
            c2.displayCourseInfo();
        }
    }
