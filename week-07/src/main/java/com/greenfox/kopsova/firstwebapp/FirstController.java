package com.greenfox.kopsova.firstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {


    @RequestMapping("")
    @ResponseBody
    private String index(){
        return "<h1>Hello world</h1>";
    }
}
