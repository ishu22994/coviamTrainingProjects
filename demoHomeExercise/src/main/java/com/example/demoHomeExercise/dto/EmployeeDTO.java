package com.example.demoHomeExercise.dto;

import com.example.demoHomeExercise.entity.Department;

public class EmployeeDTO {

    private int id;
    private String name;
    private String firstName;
    private String lirstName;
    private int age;
    private double salary;
    private Department departmentIdentifier;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLirstName() {
        return lirstName;
    }

    public void setLirstName(String lirstName) {
        this.lirstName = lirstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartmentIdentifier() {
        return departmentIdentifier;
    }

    public void setDepartmentIdentifier(Department departmentIdentifier) {
        this.departmentIdentifier = departmentIdentifier;
    }
}
