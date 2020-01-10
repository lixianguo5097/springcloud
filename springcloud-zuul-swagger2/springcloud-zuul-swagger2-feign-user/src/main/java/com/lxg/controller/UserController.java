package com.lxg.controller;

import com.lxg.feign.EmailFeign;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LXG
 * @date 2020-1-10
 */
@RestController
@Api(tags = "用户微服务")
public class UserController {
    @Autowired
    private EmailFeign emailFeign;

    @GetMapping("/user")
    public String user() {
        return "用户获取邮箱："+emailFeign.email();
    }
}
