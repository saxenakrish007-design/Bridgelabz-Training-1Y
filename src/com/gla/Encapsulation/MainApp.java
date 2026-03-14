package com.gla.Encapsulation;

public class MainApp {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101,"Krishna",50000);
        Employee e2 = new PartTimeEmployee(102,"Rahul",40,500);

        Department d1 = (Department)e1;
        d1.assignDepartment("IT");

        Department d2 = (Department)e2;
        d2.assignDepartment("Support");

        Employee[] employees = {e1,e2};

        for(Employee e : employees){
            e.displayDetails();
            System.out.println("Salary: "+e.calculateSalary());

            Department d = (Department)e;
            System.out.println("Department: "+d.getDepartmentDetails());
            System.out.println("----------------");
        }
    }
}

abstract class Employee{

    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id,String name,double salary){
        this.employeeId=id;
        this.name=name;
        this.baseSalary=salary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("ID: "+employeeId);
        System.out.println("Name: "+name);
    }
}

interface Department{

    void assignDepartment(String dept);

    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{

    private String department;

    public FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }

    public double calculateSalary(){
        return getBaseSalary();
    }

    public void assignDepartment(String dept){
        department=dept;
    }

    public String getDepartmentDetails(){
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department{

    private int hours;
    private double rate;
    private String department;

    public PartTimeEmployee(int id,String name,int hours,double rate){
        super(id,name,0);
        this.hours=hours;
        this.rate=rate;
    }

    public double calculateSalary(){
        return hours*rate;
    }

    public void assignDepartment(String dept){
        department=dept;
    }

    public String getDepartmentDetails(){
        return department;
    }
}
