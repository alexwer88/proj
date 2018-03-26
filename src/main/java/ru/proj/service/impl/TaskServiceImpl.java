package ru.proj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.proj.model.dto.TaskDTO;
import ru.proj.repository.TaskRepository;
import ru.proj.service.TaskService;
import ru.proj.utils.Converter;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void addTask(TaskDTO task) {
        taskRepository.save(Converter.toTaskEntity(task));
    }

    @Override
    public List<TaskDTO> getTasks() {
        return taskRepository.findAll().stream()
                .map(Converter::toTaskDTO)
                .collect(Collectors.toList());
    }

}
