package com.example.simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    // This creates a simple GET endpoint at http://localhost:8080/hello
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("Message", "Hello World from Java Spring Boot!");
    }
}
