package com.springLearning.DevToolsDemo.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FuRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    // Added this getmapping request after starting of server to test spring-boot-devtools is working fine or not
    @GetMapping("/api")
    public String firstAPI(){
        return "My First API";
    }
}
