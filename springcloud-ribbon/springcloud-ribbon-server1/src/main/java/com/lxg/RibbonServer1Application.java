package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LXG
 * @date 2020-3-13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServer1Application.class, args);
    }
}