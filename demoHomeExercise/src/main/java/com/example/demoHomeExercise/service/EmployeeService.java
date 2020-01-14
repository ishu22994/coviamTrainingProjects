package com.example.demoHomeExercise.service;

import com.example.demoHomeExercise.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    Iterable<Employee> getAll();

    Employee getAllEmployee(int id);

    void delete(int id);

    void update(Employee employee);

}
