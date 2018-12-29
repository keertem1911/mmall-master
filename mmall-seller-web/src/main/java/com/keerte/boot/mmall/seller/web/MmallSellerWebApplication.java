package com.keerte.boot.mmall.seller.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.keerte.boot.mmall.seller"})
@ComponentScan("com.keerte.boot.mmall.seller")
public class MmallSellerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmallSellerWebApplication.class, args);
    }

}

