package com.example.demoPostgres.repository;

import com.example.demoPostgres.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,String> {

}
