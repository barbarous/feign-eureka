package org.web.server;

import org.springframework.web.bind.annotation.RequestMapping;

public interface StatusController {
    @RequestMapping("/status")
    String status();


}
