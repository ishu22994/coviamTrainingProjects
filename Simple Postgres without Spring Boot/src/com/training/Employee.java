package com.training;

public class Employee {

    private String fistName;
    private String lastName;
    private String email;

    public Employee(){

    }

    public Employee(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
