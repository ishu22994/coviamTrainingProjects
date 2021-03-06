package com.training.OrganizationManagement.entity;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {

    @Id
    @Column(unique = true)
    private int employeeId;
    private String employeeName;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private Double employeeSalary;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="departmentId")
    private DepartmentEntity employeeDepartmentId;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public DepartmentEntity getEmployeeDepartmentId() {
        return employeeDepartmentId;
    }

    public void setEmployeeDepartmentId(DepartmentEntity employeeDepartmentId) {
        this.employeeDepartmentId = employeeDepartmentId;
    }
}
