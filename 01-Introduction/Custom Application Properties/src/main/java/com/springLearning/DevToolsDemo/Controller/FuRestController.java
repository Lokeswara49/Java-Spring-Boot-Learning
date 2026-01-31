package com.springLearning.DevToolsDemo.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FuRestController {
    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    // Added this getmapping request after starting of server to test spring-boot-devtools is working fine or not
    @GetMapping("/api")
    public String firstAPI(){
        return "My First API";
    }
    @GetMapping("/props")
    public String props(){
        return "My First API " + coachName;
    }
    @GetMapping("/api2")
    public String firstAPI2(){
        return "My 2nd API";
    }
    @GetMapping("/api3")
    public String firstAPI3(){
        return "My 5nd API";
    }
    @GetMapping("/api4")
    public String firstAPI4(){
        return "My 4nd API";
    }
    @GetMapping("/api5")
    public String firstAPI5(){
        return "My 9nd API";
    }
    @GetMapping("/api10")
    public String firstAPI10(){
        return "My 10nd API";
    }
}
