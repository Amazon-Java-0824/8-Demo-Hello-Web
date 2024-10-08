package com.ironhack.helloweb.service;

import com.ironhack.helloweb.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    public Greeting sayHello(String name){
        if(name == null)
            return new Greeting("Hello World!");
        return new Greeting("Hello, " + name);
    }


    public List<Greeting> getItalianGreetings(){
        var greet1 = new Greeting("Ciao");
        var greet2 = new Greeting("Buongiorno");
        var greet3 = new Greeting("Buonasera");

        return List.of(greet1, greet2, greet3);
    }
}
