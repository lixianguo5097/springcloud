package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 这其实是一个普通的服务，把自己注入到eureka中
 * @author LXG
 * @date 2019-12-31
 */
@SpringBootApplication
@EnableEurekaClient
public class FeignServerApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerApp.class, args);
    }
}
