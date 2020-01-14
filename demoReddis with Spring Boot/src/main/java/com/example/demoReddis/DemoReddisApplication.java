package com.example.demoReddis;

import com.example.demoReddis.entity.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class DemoReddisApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoReddisApplication.class, args);
	}

	@Value("${spring.internal.redis.host}")
	private String redisHost="locahost";
	@Value("${spring.internal.redis.port}")
	private int redisPort=6370;

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
		jedisConFactory.setHostName(redisHost);
		jedisConFactory.setPort(redisPort);
		return jedisConFactory;
	}
	@Bean
	public RedisTemplate<String, Employee> redisTemplate() {
		RedisTemplate<String, Employee> template = new RedisTemplate<String, Employee>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		return template;
	}

}
