package com.gla.Story_Problems_1;
import com.gla.Packages.college.student.Student;
public class Story_7 {
        int rollNo;
        String name;
        double marks;
        public Story_7(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
        public String calculateGrade() {
            if (marks >= 90) return "A+";
            else if (marks >= 75) return "A";
            else if (marks >= 60) return "B";
            else if (marks >= 50) return "C";
            else return "F";
        }
        public void displayInfo() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
            System.out.println("------------------------");
        }
    }
    class EngineeringStudent extends Story_7 {
        String branch;
        public EngineeringStudent(int rollNo, String name, double marks, String branch) {
            super(rollNo, name, marks);
            this.branch = branch;
        }
        @Override
        public void displayInfo() {
            String fullName = name + " (" + branch + ")";
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + fullName);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
            System.out.println("------------------------");
        }
    }
    class StudentResultSystem {
        public static void main(String[] args) {
            Story_7 s1 = new Story_7(101, "Alice", 82);
            Story_7 s2 = new EngineeringStudent(102, "Bob", 91, "Computer Science");

            s1.displayInfo();
            s2.displayInfo();
        }
    }
