package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserCreateDTO {
    private String name;
    private String email;
    private List<Long> projectIds; // IDs dos projetos aos quais o usuário será vinculado
}
