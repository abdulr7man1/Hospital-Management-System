package entities;

public class Patient extends Person {
    private String bloodGroup;
    private String emergencyContact;
    private String registrationDate;
    private List<String> allergies;
    private List<String> pastMedicalRecordIds;
    private double outstandingBalance;
    private boolean insured;

    public Patient(String id, String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber,
                   String email, String address, String nationalId, int age, boolean activeStatus) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, nationalId, age, activeStatus);
    }
}
