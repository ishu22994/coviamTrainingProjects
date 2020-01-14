package com.example.demoHomeExercise.controller;


import com.example.demoHomeExercise.dto.DepartmentDTO;
import com.example.demoHomeExercise.entity.Department;
import com.example.demoHomeExercise.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping(path ="/addOrUpdate",produces = {"application/json"})
    public ResponseEntity<Integer> addOrUpdateEmployee(@RequestBody DepartmentDTO departmentDTO){

        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        Department departmentCreated = departmentService.save(department);
        return new ResponseEntity<Integer>(departmentCreated.getId(),HttpStatus.CREATED);
    }

    @GetMapping(path ="/getAllDepartment",produces = {"application/json"})
    public ResponseEntity<List<Department>> getAllEmployee() {
        Iterable<Department> departmentList = departmentService.getAll();
        return new ResponseEntity<List<Department>>((List<Department>) departmentList, HttpStatus.OK);
    }

    @GetMapping(path ="/departments/{id}",produces = {"application/json"})
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") int id) {
        Department departmentList = departmentService.getAllDepartment(id);
        return new ResponseEntity<Department>(departmentList, HttpStatus.OK);
    }

    @DeleteMapping(path ="/deleteDepartment/{id}")
    public void delete(@PathVariable("id") int id){
        System.out.println("Delete id: "+id);
        departmentService.delete(id);
    }

    @PutMapping(path ="/updateDepartment",produces = {"application/json"})
    public void update(@RequestBody DepartmentDTO departmentDTO){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        departmentService.update(department);
    }

}
