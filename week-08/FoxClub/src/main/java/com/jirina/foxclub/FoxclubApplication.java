package com.jirina.foxclub;

import com.jirina.foxclub.repository.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxclubApplication implements CommandLineRunner {
@Autowired
    FoxService foxList;
    public static void main(String[] args) {
        SpringApplication.run(FoxclubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
