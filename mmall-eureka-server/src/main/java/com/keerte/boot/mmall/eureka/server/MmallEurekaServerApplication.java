package com.keerte.boot.mmall.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MmallEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmallEurekaServerApplication.class, args);
    }

}

