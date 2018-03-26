package ru.proj.utils;

import ru.proj.model.dto.TaskDTO;
import ru.proj.model.entity.TaskEntity;

public class Converter {

    public static TaskDTO toTaskDTO(TaskEntity taskEntity) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTaskName(taskEntity.getTaskName());
        taskDTO.setCompleted(taskEntity.isCompleted());
        return taskDTO;

    }

    public static TaskEntity toTaskEntity(TaskDTO taskDTO) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTaskName(taskDTO.getTaskName());
        taskEntity.setCompleted(taskDTO.isCompleted());
        return taskEntity;
    }

}
