package org.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller implements StatusController {
    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
    @Override
    public String status() {
        return "ok";
    }
}