package com.example.demoHomeExercise.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;

    @Column(unique = true)
    private String code;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parentId")
    @Nullable
    private Department parentDepartment;

    @ManyToOne(fetch=FetchType.LAZY)
    private Organization organizationId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Department getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(Department parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public Organization getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Organization organizationId) {
        this.organizationId = organizationId;
    }
}
