package entities;

import interfaces.Displayable;

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

        setID(id);
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

}
