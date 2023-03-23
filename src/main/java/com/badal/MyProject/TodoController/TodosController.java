package com.badal.MyProject.TodoController;

import com.badal.MyProject.Entities.Todo;
import com.badal.MyProject.Service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class TodosController {
    private TodoService  todoService;

    public TodosController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String TodoController(ModelMap model){
        List<Todo> todos = todoService.findBYUsername("Badal Saini");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
}
