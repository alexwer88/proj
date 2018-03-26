package ru.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proj.model.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {


}
