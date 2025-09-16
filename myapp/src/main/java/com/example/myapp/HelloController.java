package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        
            return "Hello from my app j ";
        
    }

    
}
