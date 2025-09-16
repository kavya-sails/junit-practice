package com.learnings.junit.service;

import com.learnings.junit.data.TaskRepo;
import com.learnings.junit.stubs.TaskRepoStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaskServiceUsingStubTest {
    @Test
    public void testTaskServiceUsingStub() {
        TaskRepo taskRepo = new TaskRepoStub();
        TaskService taskService = new TaskService(taskRepo);
        List<String> res = taskService.getFilteredTasks("1");
        assertEquals(3, res.size());
    }
}
