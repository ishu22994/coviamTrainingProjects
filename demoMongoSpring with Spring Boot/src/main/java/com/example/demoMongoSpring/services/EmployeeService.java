package com.example.demoMongoSpring.services;

import com.example.demoMongoSpring.entity.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    Employee save(Employee employee);

    Employee getEmployee(int id);

    //void delete(String id);
    /*Iterable<Employee> getAll();
    Employee getEmployee(String id);
    void update(Employee employee);*/
}
