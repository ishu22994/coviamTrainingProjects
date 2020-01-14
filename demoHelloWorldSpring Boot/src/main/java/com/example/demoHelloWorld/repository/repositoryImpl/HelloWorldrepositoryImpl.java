package com.example.demoHelloWorld.repository.repositoryImpl;

import com.example.demoHelloWorld.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class HelloWorldrepositoryImpl implements HelloWorldRepository {

    public HelloWorldrepositoryImpl() {
        System.out.println("I am in Repository Impl");
    }

    @Override
    public String getMessage() {
        System.out.println("I am in Repo : "+this.hashCode());
        return "Hello I am from HelloWORLD Repository!!";
    }



    @PostConstruct
    public void initRepo(){

        System.out.println("In it Repo");

    }
}
