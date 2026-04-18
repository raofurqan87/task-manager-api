package com.furqan.taskmanager;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {
    private final TaskService taskService;
    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer id) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task created = taskService.createTask(task.getTitle());
        return ResponseEntity.status(201).body(created);
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Integer id, @RequestBody Task task) {
        Task updated = taskService.updateTask(id, task.getTitle(), task.isCompleted());
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Integer id) {
        boolean deleted = taskService.deleteTask(id);
        if (deleted) {
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}