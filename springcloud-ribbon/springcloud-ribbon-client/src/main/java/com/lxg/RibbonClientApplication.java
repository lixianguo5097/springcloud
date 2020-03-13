package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author LXG
 * @date 2020-3-13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class, args);
    }
}