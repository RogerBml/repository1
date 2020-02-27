package com.sgcc.pms.microservicehomepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.sgcc.pms.microservicehomepage.service")
//@EnableCircuitBreaker
public class MicroserviceHomepageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHomepageApplication.class, args);
    }

}
