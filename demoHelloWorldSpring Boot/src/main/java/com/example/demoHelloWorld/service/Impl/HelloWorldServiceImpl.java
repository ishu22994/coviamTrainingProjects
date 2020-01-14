package com.example.demoHelloWorld.service.Impl;

import com.example.demoHelloWorld.repository.HelloWorldRepository;
import com.example.demoHelloWorld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {


    public HelloWorldServiceImpl(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
        System.out.println("I am in Service Impl");
    }

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @Override
    public String getMessage() {
        System.out.println("I am in Service: "+this.hashCode());
        return helloWorldRepository.getMessage();
    }

    @PostConstruct
    public void init(){

        System.out.println("In it ServiceImpl");

    }
}
