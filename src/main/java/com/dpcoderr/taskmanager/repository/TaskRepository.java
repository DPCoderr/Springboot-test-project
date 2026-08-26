package com.dpcoderr.taskmanager.repository;

import com.dpcoderr.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
