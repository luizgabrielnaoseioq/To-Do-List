package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ProjectDTO {
    private Long id;
    private String name;
    private String description;
    private List<Long> userIds; // Lista de IDs dos usuários vinculados
}
