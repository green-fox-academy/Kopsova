package com.jirina.firsttodo.Controller;

import com.jirina.firsttodo.Controller.model.ToDo;
import com.jirina.firsttodo.Controller.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirsttodoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FirsttodoApplication.class, args);
    }
@Autowired
ToDoRepository toDoRepo;

    @Override
    public void run(String... args) throws Exception {
        toDoRepo.save(new ToDo("I have to learn Object Relational Mapping"));
        toDoRepo.save(new ToDo("Pet a fox."));
        toDoRepo.save(new ToDo("Say hello to fox."));
    }
}
