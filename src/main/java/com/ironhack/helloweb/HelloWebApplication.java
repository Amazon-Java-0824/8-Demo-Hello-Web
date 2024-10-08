package com.ironhack.helloweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWebApplication.class, args);
    }

//    I want to expose a program that returns a Greeting object that contains a message: "Hello, World!"
//    create the Greeting object
//    create a service that returns a Greeting object
//    ===== NEW =====
//    create a controller that returns a Greeting object


//    path params
//    query params


}
