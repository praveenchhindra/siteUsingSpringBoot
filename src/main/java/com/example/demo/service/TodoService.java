package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.model.Todo;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static { 
        todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(),false));
        todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(),
                false));
    }

    public List<String> retrieveTodos(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        for (Todo todo : todos) {
        	System.out.println("user");
        	System.out.println(user);
        	System.out.println("todo");
        	System.out.println(todo.getUser(todo));
            //if (todo.getUser(todo).equals(user)) {
                filteredTodos.add("Test!!");
            //}
        }
        return filteredTodos;
    }
}
