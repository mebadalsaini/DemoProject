package com.badal.MyProject.Service;

import com.badal.MyProject.Entities.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Badal Saini", "Learning java spring boot",
                LocalDate.now().plusYears(1),false ));
        todos.add(new Todo(1, "Badal Saini", "Learning DevOps ",
                LocalDate.now().plusYears(1),false ));
        todos.add(new Todo(1, "Badal Saini", "Learning Angular",
                LocalDate.now().plusYears(1),false ));
    }
    public List<Todo> findBYUsername(String username){
        return todos;
    }
}
