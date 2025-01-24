import java.util.ArrayList;
import java.util.List;

class Doctor {
    //attribute
    private String name;
    private List<Patient> patients;

    // Constructor to initialize doctor details
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    // Method to list all patients
    public void listPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Patient {
    //attribute
    private String name;
    private List<Doctor> doctors;

    // Constructor to initialize patient details
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to list all doctors
    public void listDoctors() {
        System.out.println("Doctors for patient " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
}


class Hospital {
    //attribute
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor to initialize hospital details
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to list all doctors
    public void listDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }

    // Method to list all patients
    public void listPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

public class HospitalDoctorsAndPatient{
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        // Create patients
        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // List doctors and their patients
        doctor1.listPatients();
        doctor2.listPatients();

        // List patients and their doctors
        patient1.listDoctors();
        patient2.listDoctors();

        // List all doctors and patients in the hospital
        hospital.listDoctors();
        hospital.listPatients();
    }
}

