package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specilization;
    private List<Patient> patients;

    public Doctor(String name, String specilization){
        this.name =name;
        this.specilization = specilization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecilization() {
        return specilization;
    }

    public List<Patient> getPatients() {
        return patients;
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
}