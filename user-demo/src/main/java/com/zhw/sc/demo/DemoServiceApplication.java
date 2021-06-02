package com.zhw.sc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zhw.sc.commons", "com.zhw.sc.user", "com.zhw.sc.demo"})
@EnableDiscoveryClient
@EnableFeignClients
public class DemoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}
