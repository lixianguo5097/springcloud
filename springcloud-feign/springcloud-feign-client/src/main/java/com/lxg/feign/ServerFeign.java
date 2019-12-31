package com.lxg.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LXG
 * @date 2019-12-31
 */
@FeignClient(name = "feign-server")
public interface ServerFeign {
    @RequestMapping(value = "/index")
    public String index(@RequestParam(value = "name") String name) ;
}