package com.training.OrganizationManagement.controller;

import com.training.OrganizationManagement.DTO.EmployeeDTO;
import com.training.OrganizationManagement.entity.EmployeeEntity;
import com.training.OrganizationManagement.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Integer> addEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeDTO , employeeEntity);
        EmployeeEntity employeeCreated = employeeService.save(employeeEntity);

        return new ResponseEntity<Integer>(employeeCreated.getEmployeeId(),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable int id){
        employeeService.findById(id);

        return new ResponseEntity<String>(employeeService.findById(id).getEmployeeFirstName(),HttpStatus.ACCEPTED);
    }

}
