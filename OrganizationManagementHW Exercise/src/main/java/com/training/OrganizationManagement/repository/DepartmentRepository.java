package com.training.OrganizationManagement.repository;

import com.training.OrganizationManagement.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {

 /*List<DepartmentEntity> findByDepartmentparentdepartment(DepartmentEntity departmentEntity);*/


}
