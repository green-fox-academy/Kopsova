package com.jirina.foxclub.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="food")
public class Food {
    @Id
    @GeneratedValue
    long id;
    String food;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="fox_id")
    List<Fox> foxes;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="nutritionType_id")
    NutritionType nutritionType;




}


