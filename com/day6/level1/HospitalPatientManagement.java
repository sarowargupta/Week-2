package com.day6.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract Class: Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    //constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //getter and setter
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //abstract method to calculate bill
    public abstract double calculateBill();
}

// Interface: MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Subclass: InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int numberOfDays;
    private List<String> medicalRecords;

    //constructor to initialize InPatient details
    public InPatient(String patientId, String name, int age, double dailyCharge, int numberOfDays) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}

// Subclass: OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords;

    //Constructor to initialize OutPatient details
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}

// Main Class
public class HospitalPatientManagement {
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord recordHolder = (MedicalRecord) patient;
                recordHolder.viewRecords();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //object of InPatient
        InPatient inPatient = new InPatient("P001", "John", 45, 1500, 5);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Underwent successful operation.");

        //object of OutPatient
        OutPatient outPatient = new OutPatient("P002", "Johny", 30, 500);
        outPatient.addRecord("Consulted for flu symptoms.");

        //List for add patient
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        //method for processing every patient
        processPatients(patients);
    }
}

