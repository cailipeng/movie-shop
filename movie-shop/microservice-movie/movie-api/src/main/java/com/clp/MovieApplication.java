package com.clp;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = "com.clp.dao")
@EnableAutoConfiguration
@EnableFeignClients
@EnableEurekaClient
public class MovieApplication {

	private static Logger logger = LoggerFactory.getLogger(MovieApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
