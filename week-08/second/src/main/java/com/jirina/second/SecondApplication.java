package com.jirina.second;



import com.jirina.second.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jirina.second.repository.ToDoRepository;


@SpringBootApplication
public class SecondApplication implements CommandLineRunner {
    @Autowired
    ToDoRepository toDoRepo;

    public static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        toDoRepo.save(new ToDo("I have to learn Object Relational Mapping"));
//        toDoRepo.save(new ToDo("Pet a fox."));
//        toDoRepo.save(new ToDo("Say hello to fox."));
//        toDoRepo.save(new ToDo("Eat donut."));
//        toDoRepo.save(new ToDo("Water the flowers."));
//        toDoRepo.save(new ToDo("Say hello to dog."));
//        toDoRepo.save(new ToDo("Say hello to mouse."));
    }
}
