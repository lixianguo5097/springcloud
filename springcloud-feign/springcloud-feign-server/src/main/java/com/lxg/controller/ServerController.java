package com.lxg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LXG
 * @date 2019-12-31
 */
@RestController
public class ServerController {
    @RequestMapping("/index")
    public String index(@RequestParam String name) {
        return name+"----这是被调用的服务!";
    }
}