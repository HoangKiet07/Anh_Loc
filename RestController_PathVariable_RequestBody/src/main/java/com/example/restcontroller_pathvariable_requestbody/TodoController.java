package com.example.restcontroller_pathvariable_requestbody;

import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private List<Todo> listToDo = new ArrayList<Todo>();

    @PostConstruct
    public void init(){
        Todo todo1 = new Todo(1, "Kiet");
        Todo todo2 = new Todo(2, "Anh Loc");
        listToDo.add(todo1);
        listToDo.add(todo2);
    }

    @GetMapping("/todo")
    public List<Todo> getListToDo(){
        return listToDo;
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId){
        return listToDo.get(todoId-1);
    }

    @PutMapping("/todo/{todoId}")
    public Todo putTodo(@PathVariable(name = "todoId") Integer todoId, @RequestBody Todo todo){
        listToDo.set(todoId-1, todo);
        return todo;
    }
}
