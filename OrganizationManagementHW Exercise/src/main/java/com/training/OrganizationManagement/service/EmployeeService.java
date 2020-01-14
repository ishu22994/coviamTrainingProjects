package com.training.OrganizationManagement.service;

import com.training.OrganizationManagement.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeService {


    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity findById(int Id);
    int getNumberOfEmployeesInDepartment(int dId);
    Double getAverageSalary(int dId);

}
