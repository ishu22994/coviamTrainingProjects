package com.training.OrganizationManagement.repository;

import com.training.OrganizationManagement.entity.OrganizationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<OrganizationEntity,Integer> {
}
