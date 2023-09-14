package info.nahid.service;
import info.nahid.entity.Todo;
import info.nahid.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }
    public Todo getTodo(String id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo.orElse(null);
    }
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }
    public void updateTodo(String id, Todo todo) {
        todoRepository.save(todo);
    }
    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }

}
