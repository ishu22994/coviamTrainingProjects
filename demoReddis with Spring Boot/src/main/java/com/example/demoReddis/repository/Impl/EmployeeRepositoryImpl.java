package com.example.demoReddis.repository.Impl;

import com.example.demoReddis.entity.Employee;
import com.example.demoReddis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final String EMPLOYEECOLLECTION = "Employee";


    private RedisTemplate<String,Employee> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public EmployeeRepositoryImpl(RedisTemplate<String,Employee> redisTemplate){
            this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    public void init(){
        this.hashOperations = this.redisTemplate.opsForHash();
    }

    @Override
    public List<Employee> findAll(){
        Map<String,Employee> allElements = hashOperations.entries(EMPLOYEECOLLECTION);
        return allElements.values().stream().collect(Collectors.toList());
    }

    @Override
    public Employee findOne(String employeeId){
        return (Employee) hashOperations.get(EMPLOYEECOLLECTION,employeeId);
    }

    @Override
    public Employee save(Employee employee){
        hashOperations.put(EMPLOYEECOLLECTION,employee.getEmployeeId(),employee);
        return employee;
    }

    @Override
    public void deleteById(String id) {

    }


    public Employee insert(Employee employee){
        hashOperations.put(EMPLOYEECOLLECTION,employee.getEmployeeId(),employee);
        return employee;
    }
}
