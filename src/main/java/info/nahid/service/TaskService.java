package info.nahid.service;

import info.nahid.entity.Task;
import info.nahid.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Task getTask(String id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }
    public void addTasks(Task task) {
        taskRepository.save(task);
    }
}
