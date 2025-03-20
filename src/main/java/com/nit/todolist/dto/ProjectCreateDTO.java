package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ProjectCreateDTO {
    private String name;
    private String description;
    private List<Long> userIds; // IDs dos usuários que fazem parte do projeto
}
