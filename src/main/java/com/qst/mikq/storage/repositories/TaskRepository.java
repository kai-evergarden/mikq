package com.qst.mikq.storage.repositories;

import com.qst.mikq.storage.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
