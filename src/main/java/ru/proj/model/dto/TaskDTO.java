package ru.proj.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * DTO задачи
 */
@Getter
@Setter
@ToString
public class TaskDTO {

    /**
     * Наименование
     */
    @NotNull
    @Size(min = 1)
    private String taskName;

    /**
     * Результат выполнения
     */
    private boolean completed;
}
