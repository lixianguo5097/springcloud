package com.lxg.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LXG
 * @date 2020-3-13
 */
@FeignClient(name = "springcloud-ribbon-server")
public interface RibbonRemote {
    @RequestMapping(value = "/ribbon")
    public String ribbon(@RequestParam(value = "name") String name);
}
