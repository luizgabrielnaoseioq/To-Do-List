package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long projectId; // ID do projeto ao qual a tarefa pertence
}
