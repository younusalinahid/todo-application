package info.nahid.controller;
import info.nahid.entity.Todo;
import info.nahid.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodo() {
        return todoService.getAllTodo();
    }

    @GetMapping("todos/{id}")
    public Todo getTodo(@PathVariable String id) {
        return todoService.getTodo(id);
    }

    @PostMapping(value = "/todos")
    public String addTopic(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return "Save todo successfully";
    }

    @PutMapping(value = "/todos/{id}")
    public String updateTodo(@RequestBody Todo todo, @PathVariable String id) {
        todoService.updateTodo(id, todo );
        return "Update todo successfully";
    }

    @DeleteMapping(value = "/todos/{id}")
    public String deleteTodo(@PathVariable String id) {
        todoService.deleteTodo(id);
        return "Delete todo successfully";
    }
}
