package com.gla.Story_Problems_1;

public class Story_4 {
        int empId;
        String name;
        public Story_4(int empId, String name) {
            this.empId = empId;
            this.name = name;
        }
        public String generateEmail() {
            return name.toLowerCase() + "@company.com";
        }

        public void displayInfo() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Email: " + generateEmail());
            System.out.println("-------------------------");
        }
    }
    class Manager extends Story_4{
        String department;
        public Manager(int empId, String name, String department) {
            super(empId, name);
            this.department = department;
        }
        @Override
        public String generateEmail() {
            return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
        }
        @Override
        public void displayInfo() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Email: " + generateEmail());
            System.out.println("-------------------------");
        }
    }
    class EmployeeManagementSystem {
        public static void main(String[] args) {
            Story_4 e1 = new Story_4(101, "Alice");
            Story_4 e2 = new Manager(102, "Bob", "HR");
            e1.displayInfo();
            e2.displayInfo();
        }
    }
