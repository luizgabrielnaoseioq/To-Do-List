package com.nit.todolist.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateDTO {
    private String title;
    private String description;
    private String status;
    private Long projectId; // ID do projeto onde a tarefa será criada
}
