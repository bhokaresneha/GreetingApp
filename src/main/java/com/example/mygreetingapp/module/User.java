package com.example.mygreetingapp.module;

public class User {
    String firstName;
    String lastName;

    public User(User data) {
        this.firstName=data.firstName;
        this.lastName=data.lastName;
    }
    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
