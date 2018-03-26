package ru.proj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.proj.model.dto.TaskDTO;
import ru.proj.service.TaskService;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * Метод, добавляющий задачу
     *
     * @param task задача
     * @return код HTTP ошибки
     */
    @RequestMapping(value = "insert", method = RequestMethod.PUT)
    public ResponseEntity<String> addTask(@RequestBody @Valid TaskDTO task) {
        try {
            taskService.addTask(task);
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }

        return ResponseEntity.ok().body("Task добавлен");
    }

    /**
     * Метод, получающий список задач
     *
     * @return список задач
     */
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<TaskDTO> getTasks() {
        return taskService.getTasks();
    }
}
