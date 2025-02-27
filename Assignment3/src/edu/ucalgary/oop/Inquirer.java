package edu.ucalgary.oop;

public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicesPhone;

    public Inquirer(String firstName, String lastName, String phone, String info) {
        if (firstName == null || lastName == null || phone == null || info == null) {
            throw new IllegalArgumentException("Fields cannot be null.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhone = phone;
        this.info = info;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getServicesPhoneNum() {
        return this.servicesPhone;
    }

    public String getInfo() {
        return this.info;
    }
}
