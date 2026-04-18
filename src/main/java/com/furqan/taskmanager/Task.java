package com.furqan.taskmanager;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private boolean completed;

    public Task() {

    }
    public Task(Integer id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}