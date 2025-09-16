package com.learnings.junit.stubs;

import com.learnings.junit.data.TaskRepo;

import java.util.List;

public class TaskRepoStub implements TaskRepo {

    @Override
    public List<String> getTasks() {
        return List.of("task1", "task2", "task3","task12","task13");
    }

    @Override
    public void deleteTask(String task) {

    }
}
