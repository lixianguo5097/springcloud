package com.lxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: TODO
 * @Author: XIANGUO LI
 * @Date: 2019-10-15 10:26
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigBusServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBusServerApplication.class, args);
    }
}
