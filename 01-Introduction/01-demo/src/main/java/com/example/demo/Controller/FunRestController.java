package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/")
public class FunRestController {
    @Value("${coach}")
    private String coach;
    @GetMapping("/")
    public String sayHello(){
        return coach;
    }
}
