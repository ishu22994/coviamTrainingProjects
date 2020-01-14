package com.example.demoHomeExercise.controller;


import com.example.demoHomeExercise.dto.EmployeeDTO;
import com.example.demoHomeExercise.entity.Employee;
import com.example.demoHomeExercise.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path ="/addOrUpdate",produces = {"application/json"})
    public ResponseEntity<Integer> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        Employee employeeCreated = employeeService.save(employee);
        return new ResponseEntity<Integer>(employeeCreated.getId(),HttpStatus.CREATED);
    }

    @GetMapping(path ="/getAllEmployee",produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployee() {
        Iterable<Employee> employeeList = employeeService.getAll();
        return new ResponseEntity<List<Employee>>((List<Employee>) employeeList, HttpStatus.OK);
    }

    @GetMapping(path ="/employee/{id}",produces = {"application/json"})
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        Employee employeeList = employeeService.getAllEmployee(id);
        return new ResponseEntity<Employee>(employeeList, HttpStatus.OK);
    }

    @DeleteMapping(path ="/deleteEmployee/{id}")
    public void delete(@PathVariable("id") int id){
        employeeService.delete(id);
    }

    @PutMapping(path ="/updateEmplpoyee",produces = {"application/json"})
    public void update(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employeeService.update(employee);
    }


}
