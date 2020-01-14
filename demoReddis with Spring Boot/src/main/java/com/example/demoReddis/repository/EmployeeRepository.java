package com.example.demoReddis.repository;

import com.example.demoReddis.entity.Employee;

import javax.jnlp.PersistenceService;

public interface EmployeeRepository {
    //
    Employee save(Employee employee);

    void deleteById(String id);

    //
    Iterable<Employee> findAll();


    Employee findOne(String id);

}
