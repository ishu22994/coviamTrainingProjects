package com.example.demoMongoSpring.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "employee")
public class Employee {

    @Id
    private int employeeId;

    //@Column(name = Employee.First_Name)
    private String firstName;

    private String lastName;

    //column name for this DateOfBirth
    private Date dateOfBirth;

    private Date dateOfJoining;



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }



}
