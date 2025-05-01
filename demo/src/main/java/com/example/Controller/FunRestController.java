package com.example.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class FunRestController {
    @GetMapping("\")
    public String sayHello(){
        return "Hello World";
    }
}
