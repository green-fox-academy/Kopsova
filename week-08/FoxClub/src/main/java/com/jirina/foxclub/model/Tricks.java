package com.jirina.foxclub.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tricks")
public class Tricks {
    @Id
    @GeneratedValue
    long id;
    String trick;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="fox_id")
    List<Fox> foxes;
}
