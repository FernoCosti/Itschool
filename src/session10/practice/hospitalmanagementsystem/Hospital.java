package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors;

    public List<Patient> getPatients() {
        return patients;

    }

    public void admitPatientsToList(Patient patient){
        patients.add(patient);

    }

}