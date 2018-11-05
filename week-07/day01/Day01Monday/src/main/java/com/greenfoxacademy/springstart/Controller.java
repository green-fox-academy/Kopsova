package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Controllers.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
    @org.springframework.stereotype.Controller
    public class Controller {

        @RequestMapping(value="/hello")
      //  @RequestMapping("")
        @ResponseBody
        private String hello(){
            return "<h1>Hello world!!!</h1>";


        }


    }


