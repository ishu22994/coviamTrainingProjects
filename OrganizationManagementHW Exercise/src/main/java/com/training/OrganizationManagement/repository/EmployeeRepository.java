package com.training.OrganizationManagement.repository;

import com.training.OrganizationManagement.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Integer> {
}
