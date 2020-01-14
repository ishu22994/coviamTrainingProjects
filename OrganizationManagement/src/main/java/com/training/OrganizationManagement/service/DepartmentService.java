package com.training.OrganizationManagement.service;

import com.training.OrganizationManagement.entity.DepartmentEntity;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    DepartmentEntity save(DepartmentEntity departmentEntity);
    DepartmentEntity findById(int Id);
    List<DepartmentEntity> getChildDepartments(int id);
    Map<Integer,Integer> getNumberOfEmployeesINChildDepartment(int pId);
    Map<Integer,Double> getAverageSalaryOfDepatments();

}
