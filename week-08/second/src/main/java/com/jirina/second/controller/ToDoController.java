package com.jirina.second.controller;

import com.jirina.second.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jirina.second.repository.ToDoRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping (value = "/todo")
public class ToDoController {
    @Autowired
    ToDoRepository toDoRepo;


    @RequestMapping (value = {"/", "/list"})

    public String list (Model model){
        model.addAttribute("todo", toDoRepo.findAll());
        return "todolist";

    }

    public List <ToDo>  findAll() {
        List<ToDo> todos = new ArrayList<>();
        toDoRepo.findAll().forEach(todos ::add );
        return todos;

    }



}
