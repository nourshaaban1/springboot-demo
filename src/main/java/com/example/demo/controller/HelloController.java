package com.example.demo.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST API class for the single API endpoint (/hello)
public class HelloController {

    @RequestMapping(value="/hello", method= RequestMethod.GET) // For routing with GET method
    public String sayHello() {
        return "Hello, World!"; // http://127.0.0.1:8080/hello
    }
}