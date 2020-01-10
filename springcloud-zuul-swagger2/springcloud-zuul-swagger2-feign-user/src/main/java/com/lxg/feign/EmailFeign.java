package com.lxg.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LXG
 * @date 2020-1-10
 */
@FeignClient("app-email")
public interface EmailFeign {
    @GetMapping("/email")
    public String email();
}
