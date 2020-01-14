package com.example.demoMongoSpring.controller;


import com.example.demoMongoSpring.dto.EmployeeDTO;
import com.example.demoMongoSpring.entity.Employee;
import com.example.demoMongoSpring.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mymongo")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path ="/addOrUpdate",produces = {"application/json"})
    public ResponseEntity<Integer> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        Employee employeeCreated = employeeService.save(employee);
        return new ResponseEntity<Integer>((employeeCreated.getEmployeeId()),HttpStatus.CREATED);

    }

    @PostMapping(path ="/addOrUpdateAll",produces = {"application/json"})
    public ResponseEntity<Integer> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        Employee employeeCreated = employeeService.save(employee);
        return new ResponseEntity<Integer>((employeeCreated.getEmployeeId()),HttpStatus.CREATED);

    }

    @GetMapping(path ="/employee/{id}",produces = {"application/json"})
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        Employee employeesList = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>( employeesList, HttpStatus.OK);
    }

   /* @GetMapping(path ="/getAllEmployee",produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployee() {
        Iterable<Employee> employeesList = employeeService.getAll();
        return new ResponseEntity<List<Employee>>((List<Employee>) employeesList, HttpStatus.OK);
    }

    @GetMapping(path ="/employee/{id}",produces = {"application/json"})
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
        Employee employeesList = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>( employeesList, HttpStatus.OK);
    }

   *//* @DeleteMapping(path ="/employee/{id}")
    public void delete(@PathVariable("id") String id){
        employeeService.delete(id);
    }
*//*

    @PutMapping(path ="/updateEmployee",produces = {"application/json"})
    public void update(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employeeService.update(employee);
    }*/

}
