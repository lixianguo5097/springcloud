package com.lxg.feign;

import org.springframework.stereotype.Component;

/**
 * @author LXG
 * @date 2020-3-13
 */
@Component
public class ServerFeignHystrix implements ServerFeign {
    @Override
    public String index(String name) {
        return name+"触发熔断机制！！！";
    }
}
