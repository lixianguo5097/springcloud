package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 访问http://localhost:8102/hystrix 打开熔断器监控首页
 * @author LXG
 * @date 2019-12-31
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class FeignClientApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApp.class, args);
    }
}
