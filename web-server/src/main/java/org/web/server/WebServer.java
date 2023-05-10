package org.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebServer implements StatusController {
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class, args);
    }
    @Override
    public String status() {
        return "ok";
    }
}