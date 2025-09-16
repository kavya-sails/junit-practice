package com.learnings.junit.service;

import com.learnings.junit.data.TaskRepo;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class TaskServiceUsingMockTest {

    @Test
    public void testUsingMock() {
        TaskRepo taskRepo = mock(TaskRepo.class);
        TaskService taskService = new TaskService(taskRepo);
        when(taskRepo.getTasks()).thenReturn(List.of("task1", "task2","task3"));
        assertEquals(3,
                taskService.getFilteredTasks("task").size());
    }

    @Test
    public void testUsingMock_bdd() {
        TaskRepo taskRepo = mock(TaskRepo.class);
        List<String> allTasks = List.of("task1", "task2", "task3", "dance");
        TaskService taskService = new TaskService(taskRepo);

        //given
        given(taskRepo.getTasks()).willReturn(allTasks);

        //when
        List<String> filteredTasks = taskService.getFilteredTasks("task1");

        //then
        assertThat(3, is(filteredTasks.size()));
    }

    @Test
    public void testUsingMock_verify_bdd2() {
        TaskRepo taskRepo = mock(TaskRepo.class);
        List<String> allTasks = List.of("task1", "task2", "task3", "dance");
        TaskService taskService = new TaskService(taskRepo);

        //given
        given(taskRepo.getTasks()).willReturn(allTasks);

        //when
        taskService.deleteTask("task1");

        //then
//        verify(taskRepo).deleteTask("task1");
        verify(taskRepo,times(0)).deleteTask("dance");
//        verify(taskRepo,never()).deleteTask("dance");
    }
}
