package com.example.fetchsftp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.example.common"})
public class FetchSftpApplication {
    public static void main(String[] args) {
        SpringApplication.run(FetchSftpApplication.class, args);
    }


}
