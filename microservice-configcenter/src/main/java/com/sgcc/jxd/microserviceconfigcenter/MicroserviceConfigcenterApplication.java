package com.sgcc.jxd.microserviceconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigcenterApplication.class, args);
    }

}
