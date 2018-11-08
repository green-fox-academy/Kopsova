package com.jirka.tamagochi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

    ArrayList <com.greenfox.foxclub.Fox> foxes;

    public  FoxService (){
        foxes = new ArrayList<com.greenfox.foxclub.Fox>();
        foxes.add(new com.greenfox.foxclub.Fox("Karak"));
        foxes.add(new com.greenfox.foxclub.Fox("Bystrouska"));
        foxes.add(new com.greenfox.foxclub.Fox("Vulpes"));
    }

}
