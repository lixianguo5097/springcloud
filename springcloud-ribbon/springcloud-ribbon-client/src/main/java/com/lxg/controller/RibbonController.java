package com.lxg.controller;

import com.lxg.remote.RibbonRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LXG
 * @date 2020-3-13
 */
@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    public String ribbon(@RequestParam String name) {
        //进行远程调用
        return restTemplate.getForObject("http://springcloud-ribbon-server/ribbon/?name="+name, String.class);
    }

    @Autowired
    private RibbonRemote ribbonRemote;
    @RequestMapping("/ribbon/{name}")
    public String ribbonFeign(@PathVariable("name") String name) {
        //进行远程调用
        return ribbonRemote.ribbon(name);
    }
}
