package com.training.OrganizationManagement.controller;

import com.training.OrganizationManagement.DTO.DepartmentDTO;
import com.training.OrganizationManagement.entity.DepartmentEntity;
import com.training.OrganizationManagement.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<Integer> addOrganization(@RequestBody DepartmentDTO departmentDTO){
        DepartmentEntity departmentEntity = new DepartmentEntity();
        BeanUtils.copyProperties(departmentDTO , departmentEntity);
        DepartmentEntity departmentCreated = departmentService.save(departmentEntity);

        return new ResponseEntity<Integer>(departmentCreated.getDepartmentId(),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable int id){
        departmentService.findById(id);

        return new ResponseEntity<String>(departmentService.findById(id).getDepartmentName(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/childDepartment/{id}")
    public ResponseEntity<String> getAllDepartment(@PathVariable int id){
        List<DepartmentEntity> departmentEntityList = new ArrayList<>();
        departmentEntityList=departmentService.getChildDepartments(id);
        for(DepartmentEntity departmentEntity : departmentEntityList) System.out.println(departmentEntity.getDepartmentId());
        return new ResponseEntity<String>(departmentEntityList.get(0).getDepartmentName(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/getemployees/{id}")
    public  ResponseEntity<Integer> getNumberOfEmployees(@PathVariable int id){
        Map<Integer,Integer> map =departmentService.getNumberOfEmployeesINChildDepartment(id);
        map.forEach((k,v) -> System.out.println("Id  " + k + " Count " + v));

        return  new ResponseEntity<Integer>(1,HttpStatus.ACCEPTED);
    }
    @GetMapping("/averagesalary")
    public ResponseEntity<String> getAveragesalary(){
        Map<Integer,Double> map = departmentService.getAverageSalaryOfDepatments();
        map.forEach((k,v)-> System.out.println("Department Id " + k + "Average Salary " + v ));
        return new ResponseEntity<String>("doneeeeee",HttpStatus.ACCEPTED);
    }

}
