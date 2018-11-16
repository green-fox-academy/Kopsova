package com.jirina.foxclub.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="nutritiontype")
public class NutritionType {
    @Id
    @GeneratedValue
    long id;
    String nutritype;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="food_id")
    List<Food> menu;
}
