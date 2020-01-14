package com.training.OrganizationManagement.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="DEPARTMENT")
public class DepartmentEntity {

    @Id
    @Column(unique = true)
    private int departmentId;
    private String departmentName;
    private String departmentCode;

    @Nullable
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="dId")
    private DepartmentEntity departmentParentDepartment;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="organizationId")
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
