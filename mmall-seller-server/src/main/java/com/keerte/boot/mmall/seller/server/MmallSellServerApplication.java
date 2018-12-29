package com.keerte.boot.mmall.seller.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.keerte.boot.mmall.seller.server.dao")
public class MmallSellServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmallSellServerApplication.class, args);
    }

}

