package com.laoyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class GateWayBootMain9901 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayBootMain9901.class,args);
    }
}