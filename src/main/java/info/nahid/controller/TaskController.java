package info.nahid.controller;

import info.nahid.entity.Task;
import info.nahid.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//it defines several HTTP endpoints for managing user data.

public class TaskController {

    @Autowired
    //Spring Boot automatically injects the UserRepository bean into the UserService
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTask() {
        return taskService.getAllTasks();
    }
    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable String id) {
        return taskService.getTask(id);
        //@PathVariable annotation is used to extract values from the URI of a request in a Spring MVC controller method.
    }
    @PostMapping(value = "/tasks")
    public String addTopic(@RequestBody Task task) {
        taskService.addTasks(task);
        return "Save task successfully";
    }
    @PutMapping(value = "/tasks/{id}")
    public String udpateTask(@RequestBody Task task, @PathVariable String id) {
        taskService.updateTask(id, task);
        return "Update task successfully";
    }
    @DeleteMapping(value = "/tasks/{id}")
    public String deleteTask(@PathVariable String id){
        taskService.deleteTask(id);
        return "Delete task successfully";
    }

}
