package info.nahid.service;

import info.nahid.entity.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task("java","Core Java","Core Java Description"),
            new Task("spring","Spring Framework","Spring Framework Description"),
            new Task("javascript","Javascript","Core Javascript Description")
    ));

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTask(String id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().get();
    }
}
