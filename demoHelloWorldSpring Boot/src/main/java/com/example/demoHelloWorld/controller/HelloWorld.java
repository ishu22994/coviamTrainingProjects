package com.example.demoHelloWorld.controller;

import com.example.demoHelloWorld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {

    public HelloWorld(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
        System.out.println("I am in Controller");
    }

    ///DTO will give the state and behaviour to us.
    //otherwise it will not have state or behaviour

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/getMessage")
    public String helloWorld(){

        System.out.println(this.hashCode());
        return helloWorldService.getMessage();
        //return "Hello Ishit!!";
    }

    @PostConstruct
    public void init(){
        System.out.println("In it Controller");
    }


}
