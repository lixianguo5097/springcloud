package com.lxg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* @Title: ConsumerController
* @Description: 
* 用于做转发请求
* @Version:1.0.0  
* @author pancm
* @date 2018年3月29日
 */
@RestController
public class RibbonController {

	@RequestMapping("/ribbon")
    public String index(@RequestParam String name) {
        return name+",Hello World! 这里是server2！！";
    }

}
