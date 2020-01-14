package com.example.demoMongoSpring.repository;

import com.example.demoMongoSpring.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.naming.directory.Attributes;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {


}
