package com.example.demoHomeExercise.service.Impl;

import com.example.demoHomeExercise.entity.Organization;
import com.example.demoHomeExercise.repository.OrganizationRepository;
import com.example.demoHomeExercise.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    public Organization getOrganization(int id) {
        return organizationRepository.findById(id).get();
    }


    public Organization save(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Iterable<Organization> getAll() {
        return organizationRepository.findAll();
    }

    @Override
    public void delete(int id) {
        organizationRepository.deleteById(id);
    }

    @Override
    public void update(Organization organization) {
        organizationRepository.save(organization);
    }

}
