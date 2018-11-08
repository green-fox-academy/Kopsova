package com.greenfox.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @RequestMapping (value="/index")
    public String index (){
        return "index";
    }


    @GetMapping (value="/login")
    public String loginGet (){
        return "login";
    }

    @PostMapping("/name")
    public String loginPost (@RequestParam String name){
        return "?name=" +name;
    }
}
