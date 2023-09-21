package session10.practice.hospitalmanagementsystem;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient patientOne = new Patient("Jhon", 60);
        Patient patientTwo = new Patient("Luap", 15);
        Patient patientThree = new Patient("Alice", 15);

        Doctor doctorOne = new Doctor("Ciomu", "Urology");
        Doctor doctorTwo = new Doctor("Stone", "Ophthalmology");
        Doctor doctorThree = new Doctor("Jones", "Surgery");

        Hospital arcadia = new Hospital();
        Hospital judetean = new Hospital();


        arcadia.admitPatientsToList(patientOne);
        judetean.admitPatientsToList(patientTwo);
        arcadia.admitPatientsToList(patientThree);

        for (Patient patient : arcadia.getPatients()){
            System.out.println("Patient of Arcadia: " + patient.getName());
        }
    }
}