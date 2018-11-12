package com.jirka.tamagochi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class FoxController {
    @Autowired
    FoxService service;

    ArrayList<String> food = new ArrayList<>();
    ArrayList<String> drink = new ArrayList<>();

    public FoxController(){
        food.add("vegetable");
        food.add("pizza");
        food.add("meat");
        food.add("chicken");
        food.add("steak");
        drink.add("lemonade");
        drink.add("water");
        drink.add("gin");
        drink.add("beer");
        drink.add("whiskey");
    }

    @RequestMapping (value="/nutritionStore")
    public String nutrition (@RequestParam String name, Model model){
    return "/nutritionStore";

    }




}
