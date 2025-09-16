package com.learnings.junit.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.learnings.junit.data.TaskRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TaskServiceMockitoInjectMocksTest {
    @Mock
    TaskRepo taskRepo;

    @InjectMocks
    TaskService taskService;

    @Test
    public void usingMockito() {
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        when(taskRepo.getTasks()).thenReturn(allTodos);

        List<String> todos = taskService
                .getFilteredTasks("Spring");
        assertEquals(2, todos.size());
    }
}
