package com.furqan.taskmanager;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Task getTaskById(Integer id) {
        return taskRepository.findById(id).orElse(null);
    }
    public Task createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        return taskRepository.save(task);
    }
    public Task updateTask(Integer id, String title, boolean completed) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setTitle(title);
            task.setCompleted(completed);
            return taskRepository.save(task);
        }
        return null;
    }
    public boolean deleteTask(Integer id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}