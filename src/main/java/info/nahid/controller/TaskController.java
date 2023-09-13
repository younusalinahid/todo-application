package info.nahid.controller;

import info.nahid.entity.Task;
import info.nahid.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//it defines several HTTP endpoints for managing user data.

public class TaskController {

    @Autowired
    //Spring Boot automatically injects the UserRepository bean into the UserService
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getAllTask() {
        return taskService.getAllTasks();
    }

    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable String id) {
        return taskService.getTask(id);
    }
    //@PathVariable annotation is used to extract values from the URI of a request in a Spring MVC controller method.

}
