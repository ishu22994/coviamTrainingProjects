package com.training.OrganizationManagement.service;

import com.training.OrganizationManagement.entity.OrganizationEntity;

public interface OrganizationService {
    OrganizationEntity save(OrganizationEntity organizationEntity);
    OrganizationEntity findById(int Id);
}
