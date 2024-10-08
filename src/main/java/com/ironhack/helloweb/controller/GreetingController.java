package com.ironhack.helloweb.controller;

import com.ironhack.helloweb.model.Greeting;
import com.ironhack.helloweb.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService  greetingService;

    @GetMapping("hello")
    public Greeting getHello(   ){
        return greetingService.sayHello();
    }


    @GetMapping("italy")
    public List<Greeting> getItalianGreetings(){
        return greetingService.getItalianGreetings();
    }
}
