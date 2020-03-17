package com.lxg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LXG
 * @date 2020-3-17
 */
@RestController
@RefreshScope
public class ConfigBusController {
    @Value("${my.config}")
    private String myConfig;

    @GetMapping("/getConfig")
    public String configBusTest() {
        return myConfig;
    }
}
