package com.example.demoHomeExercise.service.Impl;

import com.example.demoHomeExercise.entity.Department;
import com.example.demoHomeExercise.repository.DepartmentRepository;
import com.example.demoHomeExercise.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Iterable<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getAllDepartment(int id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public void update(Department department) {
        departmentRepository.save(department);
    }
}
