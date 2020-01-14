package com.example.demoPostgres.services;

import com.example.demoPostgres.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    void delete(String id);
    Iterable<Employee> getAll();
    Employee getEmployee(String id);
    void update(Employee employee);
}
