package com.example.eurekadog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDogApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDogApplication.class, args);
    }

}
