package com.gla.Encapsulation;
import java.util.*;
public class HospitalManagementApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101,"Krishna",25,5,2000);
        Patient p2 = new OutPatient(102,"Rahul",30,500);

        List<Patient> patients = Arrays.asList(p1,p2);

        for(Patient p : patients){

            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            if(p instanceof MedicalRecord){
                MedicalRecord m = (MedicalRecord)p;
                m.addRecord("General Checkup");
                System.out.println("Medical Record: " + m.viewRecords());
            }

            System.out.println("----------------------");
        }
    }
}

abstract class Patient{

    private int patientId;
    private String name;
    private int age;

    public Patient(int id,String name,int age){
        this.patientId=id;
        this.name=name;
        this.age=age;
    }

    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord{

    void addRecord(String diagnosis);

    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord{

    private int daysAdmitted;
    private double dailyCharge;
    private String diagnosis;

    public InPatient(int id,String name,int age,int days,double charge){
        super(id,name,age);
        this.daysAdmitted=days;
        this.dailyCharge=charge;
    }

    public double calculateBill(){
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String diagnosis){
        this.diagnosis = diagnosis;
    }

    public String viewRecords(){
        return diagnosis;
    }
}

class OutPatient extends Patient implements MedicalRecord{

    private double consultationFee;
    private String diagnosis;

    public OutPatient(int id,String name,int age,double fee){
        super(id,name,age);
        this.consultationFee=fee;
    }

    public double calculateBill(){
        return consultationFee;
    }

    public void addRecord(String diagnosis){
        this.diagnosis = diagnosis;
    }

    public String viewRecords(){
        return diagnosis;
    }
}

