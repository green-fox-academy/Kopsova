package com.jirina.foxclub.model;

import com.jirina.foxclub.repository.FoxService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name ="user")
public class User {
    @Id
    @GeneratedValue
    long id;
    String username;
    String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name="fox_id")
    List<Fox> foxes;


}
