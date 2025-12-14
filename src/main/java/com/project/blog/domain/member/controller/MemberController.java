package com.project.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@controller
public class BlogApplication {

	@GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
