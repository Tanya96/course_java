package ru.tanya;

public class NewContactData {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String number;
    private final String email;

    public NewContactData(String firstName, String lastName, String city, String number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.number = number;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}
