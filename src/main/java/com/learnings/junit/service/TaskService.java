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

    public void deleteTask(String task) {
        List<String> allTasks = taskRepo.getTasks();
        for(String task2 : allTasks) {
            if(task.equals(task2)) {
                taskRepo.deleteTask(task2);
            }
        }
    }

}
