package com.lxg;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LXG
 * @date 2020-1-10
 */
@SpringBootApplication
@EnableSwagger2Doc
@EnableEurekaClient
public class EmailApp {
    public static void main(String[] args) {
        SpringApplication.run(EmailApp.class,args);
    }
}
