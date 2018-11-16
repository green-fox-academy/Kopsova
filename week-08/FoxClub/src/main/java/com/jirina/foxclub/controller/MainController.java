package com.jirina.foxclub.controller;

import com.jirina.foxclub.model.Fox;
import com.jirina.foxclub.repository.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired
    FoxService service;

    @RequestMapping (value="/index")
    public String index (){
        return "index";
    }
    @GetMapping (value="/login")
    public String loginGet (){
        return "login";
    }
    @PostMapping (value ="/login" )
    public String namePage (@RequestParam String name, Model model){
        model.addAttribute("name",name);
        service.foxes.add(new Fox(name));
        return "redirect:/?name="+name;
    }
    @GetMapping (value = "/")
    public String nameFox (@RequestParam String name, Model model){
        int ind=0;
        model.addAttribute("name", name);
        for (int i = 0; i <service.foxes.size() ; i++) {
//            if(service.foxes.get(i) == name){
//                ind=i;
//            }
//            model.addAttribute("food", service.foxes.get(ind).food);
//            model.addAttribute("drink", service.foxes.get(ind).drink);
//            model.addAttribute("numberOfTricks",service.foxes.get(ind).tricks.size());
//            model.addAttribute("tricks",service.foxes.get(ind).tricks );
            if (ind==0){
                service.foxes.add(new Fox(name));
            }
        }
        return "index";
    }
}
