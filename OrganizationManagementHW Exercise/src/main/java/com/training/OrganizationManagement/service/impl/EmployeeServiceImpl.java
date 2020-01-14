package com.training.OrganizationManagement.service.impl;

import com.training.OrganizationManagement.entity.EmployeeEntity;
import com.training.OrganizationManagement.repository.EmployeeRepository;
import com.training.OrganizationManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity save(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity findById(int Id) {
        return employeeRepository.findById(Id).get();
    }

    @Override
    public int getNumberOfEmployeesInDepartment(int dId) {
        int count=0;
        for(EmployeeEntity employeeEntity : employeeRepository.findAll())if(employeeEntity.getEmployeeDepartmentId().getDepartmentId()==dId)count++;
        return count;
    }

    @Override
    public Double getAverageSalary(int dId) {
        Double totalSalary =0.0;
        int count=0;
        for(EmployeeEntity employeeEntity : employeeRepository.findAll()){
            if(employeeEntity.getEmployeeDepartmentId().getDepartmentId()==dId){
                count++;
                totalSalary+=employeeEntity.getEmployeeSalary();
            }
        }
        return totalSalary/count;
        }
    }



