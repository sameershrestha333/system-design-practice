package lld.oop.relationships.association;

public class AssociationMain {

    public static void main(String[] args) {
        Patient patient = new Patient("Sameer");

        Doctor doctor = new Doctor();
        doctor.Treat(patient);
        
    }


}
