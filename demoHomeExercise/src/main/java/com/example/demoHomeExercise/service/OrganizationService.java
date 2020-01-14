package com.example.demoHomeExercise.service;

import com.example.demoHomeExercise.entity.Organization;

public interface OrganizationService {


    Organization getOrganization(int id);
    Organization save(Organization organization);
    Iterable<Organization> getAll();
    void delete(int id);
    void update(Organization organization);
}
