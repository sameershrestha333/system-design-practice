package lld.oop.relationships.association;

public class Doctor {

    public void Treat(Patient patient) {
        System.out.println("Treating patient : " + patient.getName());
    }
}
