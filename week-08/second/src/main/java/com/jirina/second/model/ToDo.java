package com.jirina.second.model;


import javax.persistence.*;

@Entity
public class ToDo {

    @Id
    @GeneratedValue
    long id;

    String title;
    boolean done ;
    boolean isUrgent;

    public ToDo() {
        done = false;
    }

    public ToDo(String title) {
        this.title = title;
        done = false;
        isUrgent= false;
    }

    public String getTitle() {
        return title;
    }
    public long getId() {
        return id;
    }
}
