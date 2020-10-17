package com.clp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinApplication {
	private static Logger logger = LoggerFactory.getLogger(ZipkinApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
