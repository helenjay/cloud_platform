package com.helen.eurekaServerRep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerRepApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRepApplication.class, args);
    }

}
