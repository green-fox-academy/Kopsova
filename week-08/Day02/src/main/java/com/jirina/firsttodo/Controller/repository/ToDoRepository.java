package com.jirina.firsttodo.Controller.repository;


import com.jirina.firsttodo.Controller.model.ToDo;
import org.springframework.data.repository.CrudRepository;


public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
