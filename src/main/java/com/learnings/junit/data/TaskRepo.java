package com.learnings.junit.data;

import java.util.List;

public interface TaskRepo {
    public List<String> getTasks();

    public void deleteTask(String task);
}
