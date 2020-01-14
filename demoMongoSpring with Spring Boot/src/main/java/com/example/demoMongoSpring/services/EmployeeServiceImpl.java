package com.example.demoMongoSpring.services;


import com.example.demoMongoSpring.entity.Employee;
import com.example.demoMongoSpring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }


}
