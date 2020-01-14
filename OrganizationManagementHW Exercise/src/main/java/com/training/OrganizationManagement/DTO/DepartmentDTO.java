package com.training.OrganizationManagement.DTO;

import com.training.OrganizationManagement.entity.DepartmentEntity;
import com.training.OrganizationManagement.entity.OrganizationEntity;

public class DepartmentDTO {

    private int departmentId;
    private String departmentName;
    private String departmentCode;
    private DepartmentEntity departmentParentDepartment;
    private OrganizationEntity departmentOrganizationId;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public DepartmentEntity getDepartmentParentDepartment() {
        return departmentParentDepartment;
    }

    public void setDepartmentParentDepartment(DepartmentEntity departmentParentDepartment) {
        this.departmentParentDepartment = departmentParentDepartment;
    }

    public OrganizationEntity getDepartmentOrganizationId() {
        return departmentOrganizationId;
    }

    public void setDepartmentOrganizationId(OrganizationEntity departmentOrganizationId) {
        this.departmentOrganizationId = departmentOrganizationId;
    }
}
