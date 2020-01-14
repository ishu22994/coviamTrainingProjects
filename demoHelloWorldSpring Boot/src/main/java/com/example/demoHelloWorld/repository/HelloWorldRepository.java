package com.example.demoHelloWorld.repository;


import com.example.demoHelloWorld.service.HelloWorldService;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository {


    String getMessage();

    void initRepo();
}
