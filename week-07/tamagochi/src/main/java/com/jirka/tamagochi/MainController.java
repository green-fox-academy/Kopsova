package com.jirka.tamagochi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping (value ="/login" )
    public String namePage (@RequestParam String name, Model model){
        model.addAttribute("name",name);
        System.out.println("to je jm0no> " + name);
        return "redirect:/?name="+name;
    }
    @GetMapping (value = "/")
    public String nameFox (@RequestParam String name, Model model){
        model.addAttribute("name", name);
    return "index";
    }
}
