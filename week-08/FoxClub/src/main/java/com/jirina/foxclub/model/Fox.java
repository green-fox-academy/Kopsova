package com.jirina.foxclub.model;


import com.jirina.foxclub.repository.FoxService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="fox")
public class Fox {
   @Id
   @GeneratedValue
   long id;
   String name;
   String color;

   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn (name="user_id")
   User user;

   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn (name="food_id")
    List<Food> menu;

   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn (name="drink_id")
   List<Drink> drinks;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="trick_id")
    List<Tricks> tricks;

    public Fox(String name, List<String> tricks, String food, String drink) {
        this.setName(name);
    }

    public Fox() {
    }

    public Fox(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}



