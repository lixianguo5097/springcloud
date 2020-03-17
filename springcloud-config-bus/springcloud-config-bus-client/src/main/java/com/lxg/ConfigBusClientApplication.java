package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LXG
 * @date 2020-3-17
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigBusClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBusClientApplication.class, args);
    }
}
