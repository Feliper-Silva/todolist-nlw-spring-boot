package com.br.felipesilva.nlwtodolist.repository;

import com.br.felipesilva.nlwtodolist.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
}
