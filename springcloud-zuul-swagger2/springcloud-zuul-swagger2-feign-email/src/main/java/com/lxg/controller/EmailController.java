package com.lxg.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LXG
 * @date 2020-1-10
 */
@RestController
@Api(tags = "邮件微服务")
public class EmailController {
    @GetMapping("/email")
    public String email() {
        return "15279295097@163.com";
    }
}
