package com.learnings.junit.service;

import com.learnings.junit.data.TaskRepo;

import java.util.List;

public class TaskService {
    private TaskRepo taskRepo;
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<String> getFilteredTasks(String filterStr) {
        List<String> allTasks = taskRepo.getTasks();
        return allTasks.stream()
                .filter(task -> task.contains(filterStr))
                .toList();
    }
}
