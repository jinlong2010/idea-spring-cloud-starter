package org.kstart.idea.springcloud.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world!!!
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/say")
    public String say() {
        return "say!";
    }
}
