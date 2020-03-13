package com.lxg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于做转发请求
 * @author LXG
 * @date 2020-3-13
 */
@RestController
public class RibbonController {
	@RequestMapping("/ribbon")
    public String index(@RequestParam String name) {
        return name+",Hello World! 这里是server1！！";
    }
}
