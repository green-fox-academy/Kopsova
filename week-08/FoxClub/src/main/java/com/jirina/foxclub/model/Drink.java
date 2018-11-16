package com.jirina.foxclub.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="drink")

public class Drink {
    @Id
    @GeneratedValue
    long id;
    String drink;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="fox_id")
    List<Fox> foxes;



}
