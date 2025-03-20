package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private List<Long> projectIds; // Lista de IDs dos projetos vinculados
}
