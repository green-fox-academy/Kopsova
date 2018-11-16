package com.jirina.foxclub.repository;

import com.jirina.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

   public ArrayList <Fox> foxes;

    public  FoxService (){
        foxes = new ArrayList<Fox>();
        foxes.add(new Fox("Karak"));
        foxes.add(new Fox("Bystrouska"));
        foxes.add(new Fox("Vulpes"));
    }

}