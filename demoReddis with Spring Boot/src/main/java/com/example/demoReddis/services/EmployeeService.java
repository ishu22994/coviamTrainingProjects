package com.example.demoReddis.services;


import com.example.demoReddis.entity.Employee;

public interface EmployeeService {
    //
    Employee save(Employee employee);
    void delete(String id);
    //
    Iterable<Employee> getAll();
    //
    Employee getEmployee(String id);
    void update(Employee employee);
}
