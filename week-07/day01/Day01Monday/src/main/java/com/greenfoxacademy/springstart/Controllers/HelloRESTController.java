package com.greenfoxacademy.springstart.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {

    @RequestMapping (value="/greeting2" )
    private Greeting greeting2 (){
        Greeting greet = new Greeting(5,"Hello folks");

        return greet;
    }
    @RequestMapping (value = "/greeting1"    )
    private Greeting greeting1 (@RequestParam String name, Model Map){
        Greeting greet = new Greeting(4, "Hello," + name);

        return greet;
    }

    private AtomicLong counter = new AtomicLong();
    @RequestMapping (value= "/greeting")
    private Greeting greeting (@RequestParam String name, Model map) {

        Greeting greet = new Greeting(counter.incrementAndGet(),"Hello" + name);
        return  greet;

    }


}
