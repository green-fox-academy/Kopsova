package com.greenfox.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

    ArrayList <Fox> foxes;

    public  FoxService (){
        foxes = new ArrayList<Fox>();
        foxes.add(new Fox("Karak"));
        foxes.add(new Fox("Bystrouska"));
        foxes.add(new Fox("Vulpes"));
    }

}
