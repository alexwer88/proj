package ru.proj.service;

import ru.proj.model.dto.TaskDTO;

import java.util.List;

public interface TaskService {
    void addTask(TaskDTO task);

    List<TaskDTO> getTasks();
}
