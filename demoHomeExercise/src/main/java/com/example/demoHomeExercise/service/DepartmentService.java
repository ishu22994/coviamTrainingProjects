package com.example.demoHomeExercise.service;

import com.example.demoHomeExercise.entity.Department;

public interface DepartmentService {
    Department save(Department department);

    Iterable<Department> getAll();

    Department getAllDepartment(int id);

    void delete(int id);

    void update(Department department);

}
