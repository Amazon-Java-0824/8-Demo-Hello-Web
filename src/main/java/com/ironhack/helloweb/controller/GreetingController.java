package com.ironhack.helloweb.controller;

import com.ironhack.helloweb.model.Greeting;
import com.ironhack.helloweb.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService  greetingService;

    @GetMapping("hello")
    public Greeting getHello(@RequestParam(name = "name", required = false) String receivedName){
        return greetingService.sayHello(receivedName);

    }


    @GetMapping("italy")
    public List<Greeting> getItalianGreetings(){
        return greetingService.getItalianGreetings();
    }
}
