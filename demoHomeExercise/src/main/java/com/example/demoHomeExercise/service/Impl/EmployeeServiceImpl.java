package com.example.demoHomeExercise.service.Impl;

import com.example.demoHomeExercise.entity.Employee;
import com.example.demoHomeExercise.repository.EmployeeRepository;
import com.example.demoHomeExercise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getAllEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void update(Employee employee) {
    employeeRepository.save(employee);
    }
}
