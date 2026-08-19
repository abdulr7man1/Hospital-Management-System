package entities;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private String bloodGroup;
    private String emergencyContact;
    private String registrationDate;
    private List<String> allergies;
    private List<String> pastMedicalRecordIds;
    private double outstandingBalance;
    private boolean insured;

    public Patient(String id, String firstName,
                   String lastName, String dateOfBirth,
                   String gender, String phoneNumber,
                   String email, String address,
                   String nationalId, int age,
                   boolean activeStatus) {
        super(id, firstName, lastName, dateOfBirth,
                gender, phoneNumber, email, address,
                nationalId, age, activeStatus);
        this.bloodGroup = bloodGroup;
        this.emergencyContact = emergencyContact;
        this.registrationDate = registrationDate;
        this.allergies = new ArrayList<>();
        this.pastMedicalRecordIds = new ArrayList<>();
        setOutstandingBalance(outstandingBalance);

        this.insured = insured;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getPastMedicalRecordIds() {
        return pastMedicalRecordIds;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public void setPastMedicalRecordIds(List<String> pastMedicalRecordIds) {
        this.pastMedicalRecordIds = pastMedicalRecordIds;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        if (outstandingBalance < 0) {
            System.out.println("Rejected: outstanding balance cannot be negative.");
            return;
        }
        this.outstandingBalance = outstandingBalance;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public void addAllergy(String allergy) {

        if (allergy == null || allergy.trim().isEmpty()) {
            System.out.println("Rejected: allergy cannot be empty.");
            return;
        }

        allergies.add(allergy);
    }

    public boolean hasAllergy(String allergy) {

        if (allergy == null) {
            return false;
        }

        return allergies.contains(allergy);
    }

    public void listAllergies() {

        System.out.println("Allergies for " + getFullName() + ":");

        if (allergies.isEmpty()) {
            System.out.println("No allergies recorded.");
            return;
        }

        for (String allergy : allergies) {
            System.out.println("- " + allergy);
        }
    }

    public void addRecordId(String recordId) {

        if (recordId == null || recordId.trim().isEmpty()) {
            System.out.println("Rejected: record id cannot be empty.");
            return;
        }

        pastMedicalRecordIds.add(recordId);
    }

    public int getRecordCount() {
        return pastMedicalRecordIds.size();
    }

    public void addToBalance(double amount) {

        if (amount < 0) {
            System.out.println("Rejected: amount cannot be negative.");
            return;
        }

        outstandingBalance = outstandingBalance + amount;
    }

    public void clearBalance() {
        outstandingBalance = 0;
    }

    @Override
    public void displayInfo() {

        System.out.println("----- Patient -----");
        System.out.println("Id              : " + getId());
        System.out.println("Name            : " + getFullName());
        System.out.println("Date of birth   : " + getDateOfBirth());
        System.out.println("Gender          : " + getGender());
        System.out.println("Phone           : " + getPhoneNumber());
        System.out.println("Email           : " + getEmail());
        System.out.println("Address         : " + getAddress());
        System.out.println("National id     : " + getNationalId());
        System.out.println("Age             : " + getAge());
        System.out.println("Active          : " + isActive());


        System.out.println("Blood group     : " + bloodGroup);
        System.out.println("Emergency contact: " + emergencyContact);
        System.out.println("Registration date: " + registrationDate);
        System.out.println("Allergies       : " + allergies.size());
        System.out.println("Medical records : " + pastMedicalRecordIds.size());
        System.out.println("Outstanding     : " + outstandingBalance);
        System.out.println("Insured         : " + insured);

    }

    private String isActive() {

        return " ";
    }
}