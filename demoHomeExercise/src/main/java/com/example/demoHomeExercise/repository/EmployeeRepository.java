package com.example.demoHomeExercise.repository;

import com.example.demoHomeExercise.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
