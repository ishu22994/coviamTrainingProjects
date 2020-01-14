package com.example.demoHomeExercise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "ORGANIZATION")
public class Organization {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String name;

    @Column(unique = true)
    private String code;

    private String address;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}