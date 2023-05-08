package org.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("web-server")
public interface WebClient {
    @RequestMapping("/status")
    String status();
}
