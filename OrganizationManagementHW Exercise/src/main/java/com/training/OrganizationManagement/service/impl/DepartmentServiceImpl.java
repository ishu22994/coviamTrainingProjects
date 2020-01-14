package com.training.OrganizationManagement.service.impl;

import com.training.OrganizationManagement.entity.DepartmentEntity;
import com.training.OrganizationManagement.repository.DepartmentRepository;
import com.training.OrganizationManagement.service.DepartmentService;
import com.training.OrganizationManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeService employeeService;

    @Override
    public DepartmentEntity save(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public DepartmentEntity findById(int Id) {
        return departmentRepository.findById(Id).get();
    }

    @Override
    public List<DepartmentEntity> getChildDepartments(int id) {
        /*List<DepartmentEntity> departments=departmentRepository.findByDepartmentparentdepartment(departmentRepository.getOne(id));
        departments.forEach(departmentEntity -> System.out.println(departmentEntity.getDepartmentName()));*/
        List<DepartmentEntity> departmentEntities = departmentRepository.findAll();
        List<DepartmentEntity> result =new ArrayList<>();
        for(DepartmentEntity departmentEntity:departmentEntities){
            DepartmentEntity parentDepartment = departmentEntity.getDepartmentParentDepartment();
            if(parentDepartment!=null && parentDepartment.getDepartmentId()==id)result.add(departmentEntity);
        }
        return result;
    }

    @Override
    public Map<Integer,Integer> getNumberOfEmployeesINChildDepartment(int pId) {
        List<DepartmentEntity> childList = getChildDepartments(pId);
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(DepartmentEntity departmentEntity :childList){
           count+= employeeService.getNumberOfEmployeesInDepartment(departmentEntity.getDepartmentId());
           map.put(departmentEntity.getDepartmentId(),count);
           count=0;
        }
        return map;
    }

    @Override
    public Map<Integer, Double> getAverageSalaryOfDepatments() {
        Map<Integer,Double> map = new HashMap<>();

        for(DepartmentEntity departmentEntity : departmentRepository.findAll()){
            map.put(departmentEntity.getDepartmentId(),employeeService.getAverageSalary(departmentEntity.getDepartmentId()));
        }
        return map;
    }
}
