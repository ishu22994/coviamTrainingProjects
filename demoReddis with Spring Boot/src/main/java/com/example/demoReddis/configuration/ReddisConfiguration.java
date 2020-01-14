package com.example.demoReddis.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisServer;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class ReddisConfiguration {

    @Value("${spring.internal.redis.host}")
    private String redisHost="locahost";
    @Value("${spring.internal.redis.port}")
    private int redisPort;

    private RedisServer redisServer;

    public ReddisConfiguration() {
    }
    @PostConstruct
    public void init(){
        System.out.println("Strating redis embedded server : "+this.redisPort);
        this.redisServer = new RedisServer(redisPort);
        this.redisServer.start();
    }
    @PreDestroy
    public void destroy(){
        this.redisServer.stop();
    }
}