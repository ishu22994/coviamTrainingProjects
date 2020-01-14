package com.training.OrganizationManagement.service.impl;

import com.training.OrganizationManagement.entity.OrganizationEntity;
import com.training.OrganizationManagement.repository.OrganizationRepository;
import com.training.OrganizationManagement.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public OrganizationEntity save(OrganizationEntity organizationEntity) {
        return organizationRepository.save(organizationEntity);
    }

    @Override
    public OrganizationEntity findById(int Id) {
        return organizationRepository.findById(Id).get();
    }
}
