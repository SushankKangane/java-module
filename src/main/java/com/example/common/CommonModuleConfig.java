package com.example.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//public class CommonApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(CommonApplication.class, args);
//	}
//
//}

@Configuration
@EnableJpaRepositories(basePackages = "com.example.common.repository")
@EntityScan(basePackages = "com.example.common.entity")
public class CommonModuleConfig {
}
