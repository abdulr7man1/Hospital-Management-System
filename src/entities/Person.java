package entities;

import interfaces.Displayable;
import utils.HelperUtils;

import java.util.Objects;

public class Person implements Displayable {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;
    private String nationalId;
    private int age;
    private boolean activeStatus;


    public Person(String id, String firstName, String lastName, String dateOfBirth, String gender,
                  String phoneNumber, String email, String address,
                  String nationalId, int age, boolean activeStatus) {

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(gender);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAddress(address);
        setNationalId(nationalId);
        setAge(age);
        this.activeStatus = activeStatus;
    }

    public void person(String id, String firstName, String lastName){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public int getAge() {
        return age;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setId(String id) {
        if (HelperUtils.isEmpty(id)){
            System.out.println("Rejected: id cannot be empty. ");
            return;
        }
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (HelperUtils.isEmpty(firstName)){
            System.out.println("Rejected: first name cannot be empty");
           return;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (HelperUtils.isEmpty(lastName)) {
            System.out.println("Rejected: last name cannot be empty.");
            return;
        }
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (HelperUtils.isEmpty(dateOfBirth)) {
            System.out.println("Rejected: date of birth cannot be empty.");
            return;
        }

        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        String[] allowed = {"Male", "Female", "Other"};
        if (!HelperUtils.isOneOf(gender, allowed)) {
            System.out.println("Rejected: gender must be Male, Female or Other.");
            return;
        }
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!HelperUtils.isValidPhone(phoneNumber)) {
            System.out.println("Rejected: phone number length looks wrong.");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        if (HelperUtils.isEmpty(email)) {
            System.out.println("Rejected: email cannot be empty.");
            return;
        }
        this.email = email;
    }

    public void setAddress(String address) {
        if (HelperUtils.isEmpty(address)) {
            System.out.println("Rejected: address cannot be empty.");
            return;
        }
        this.address = address;
    }

    public void setNationalId(String nationalId) {
        if (HelperUtils.isEmpty(nationalId)) {
            System.out.println("Rejected: national id cannot be empty.");
            return;
        }
        this.nationalId = nationalId;
    }

    public void setAge(int age) {
        if (!HelperUtils.isValidAge(age)) {
            System.out.println("Rejected: age must be between 0 and 120.");
            return;
        }
        this.age = age;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public void displayInfo() {

        System.out.println("----- Person -----");
        System.out.println("Id           : " + id);
        System.out.println("Name         : " + getFullName());
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Gender       : " + gender);
        System.out.println("Phone        : " + phoneNumber);
        System.out.println("Email        : " + email);
        System.out.println("Address      : " + address);
        System.out.println("National id  : " + nationalId);
        System.out.println("Age          : " + age);
        System.out.println("Active       : " + activeStatus);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", age=" + age +
                ", activeStatus=" + activeStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }


}
