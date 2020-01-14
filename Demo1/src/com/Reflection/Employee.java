package com.Reflection;


import java.util.Date;
import java.util.Objects;

public class Employee {

    public String firstName;
    private String lastName;
    private long age;
    private Date dateOfJoining;

    public Employee(){
            firstName = "Ishit";
            lastName = "Shah";
            age = 10;
            dateOfJoining = new Date();
    }
    public Employee(String firstName, String lastName, long age, Date dateOfJoining) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
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

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getDateOfJoining(), employee.getDateOfJoining());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getLastName(), getAge(), getDateOfJoining());
    }



}
