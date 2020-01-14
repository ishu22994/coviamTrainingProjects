package com.example.demoHomeExercise.controller;


import com.example.demoHomeExercise.dto.OrganizationDTO;
import com.example.demoHomeExercise.entity.Organization;
import com.example.demoHomeExercise.service.OrganizationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping(path ="/addOrUpdate",produces = {"application/json"})
    public ResponseEntity<Integer> addOrUpdateEmployee(@RequestBody OrganizationDTO organizationDTO){
        Organization organization = new Organization();
        BeanUtils.copyProperties(organizationDTO,organization);
        Organization organizationCreated = organizationService.save(organization);
        return new ResponseEntity<Integer>(organizationCreated.getId(),HttpStatus.CREATED);
    }

    @GetMapping(path ="/getAllOrganization",produces = {"application/json"})
    public ResponseEntity<List<Organization>> getAllOrganization() {
        Iterable<Organization> organizationList = organizationService.getAll();
        return new ResponseEntity<List<Organization>>((List<Organization>) organizationList, HttpStatus.OK);
    }

    @GetMapping(path ="/organization/{id}",produces = {"application/json"})
    public ResponseEntity<Organization> getOrganizationById(@PathVariable("id") int id) {
        Organization organizationList = organizationService.getOrganization(id);
        return new ResponseEntity<Organization>(organizationList, HttpStatus.OK);
    }

    @DeleteMapping(path ="/deleteOrganization/{id}")
    public void delete(@PathVariable("id") int id){
        organizationService.delete(id);
    }

    @PutMapping(path ="/updateOrganization",produces = {"application/json"})
    public void update(@RequestBody OrganizationDTO organizationDTO){
        Organization organization = new Organization();
        BeanUtils.copyProperties(organizationDTO,organization);
        organizationService.update(organization);
    }

}
