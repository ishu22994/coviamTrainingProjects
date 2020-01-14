package com.example.demoReddis.services;


import com.example.demoReddis.entity.Employee;
import com.example.demoReddis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;



    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(String id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(String id) {
        return employeeRepository.findOne(id);
    }



    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }



}
