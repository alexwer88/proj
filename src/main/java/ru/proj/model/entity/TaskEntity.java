package ru.proj.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_id_gen")
    @SequenceGenerator(name = "task_id_gen", sequenceName = "public.task_id_seq", allocationSize = 10)
    private Long id;

    private String taskName;

    private boolean completed;

    public Long getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
