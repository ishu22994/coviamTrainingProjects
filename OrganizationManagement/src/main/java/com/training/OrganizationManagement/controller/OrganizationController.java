package com.training.OrganizationManagement.controller;

import com.training.OrganizationManagement.DTO.OrganizationDTO;
import com.training.OrganizationManagement.entity.OrganizationEntity;
import com.training.OrganizationManagement.service.OrganizationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping("/add")
    public ResponseEntity<Integer> addOrganization(@RequestBody OrganizationDTO organizationDTO){
        OrganizationEntity organizationEntity = new OrganizationEntity();
        BeanUtils.copyProperties(organizationDTO , organizationEntity);
        OrganizationEntity organizationCreated = organizationService.save(organizationEntity);

        return new ResponseEntity<Integer>(organizationCreated.getOrganizationId(),HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable int id){
        organizationService.findById(id);

        return new ResponseEntity<String>(organizationService.findById(id).getOrganizationName(),HttpStatus.ACCEPTED);
    }


}
