package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LXG
 * @date 2020-3-13
 */
@SpringBootApplication
@EnableEurekaServer
public class RibbonEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonEurekaApplication.class, args);
    }
}

