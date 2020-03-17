package com.lxg.controller;

import com.lxg.feign.ServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LXG
 * @date 2019-12-31
 */
@RestController
public class ClientController {
    @Autowired
    private ServerFeign serverFeign;

    @GetMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return serverFeign.index(name);
    }
}