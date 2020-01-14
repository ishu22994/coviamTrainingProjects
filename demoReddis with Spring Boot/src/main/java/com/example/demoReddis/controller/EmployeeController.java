package com.example.demoReddis.controller;


import com.example.demoReddis.dto.EmployeeDTO;
import com.example.demoReddis.entity.Employee;
import com.example.demoReddis.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myredis")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path ="/addOrUpdate",produces = {"application/json"})
    public ResponseEntity<String> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        Employee employeeCreated = employeeService.save(employee);
        return new ResponseEntity<String>(employeeCreated.getEmployeeId(),HttpStatus.CREATED);

    }

    @GetMapping(path ="/getAllEmployee",produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployee() {
        Iterable<Employee> employeesList = employeeService.getAll();
        return new ResponseEntity<List<Employee>>((List<Employee>) employeesList, HttpStatus.OK);
    }

    @GetMapping(path ="/employee/{id}",produces = {"application/json"})
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
        Employee employeesList = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>( employeesList, HttpStatus.OK);
    }

    @DeleteMapping(path ="/employee/{id}")
    public void delete(@PathVariable("id") String id){
        employeeService.delete(id);
    }


    @PutMapping(path ="/updateEmployee",produces = {"application/json"})
    public void update(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employeeService.update(employee);
    }

}
