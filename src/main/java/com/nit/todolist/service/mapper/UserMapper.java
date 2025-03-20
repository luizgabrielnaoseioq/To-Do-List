package com.nit.todolist.service.mapper;


import com.nit.todolist.dto.UserCreateDTO;
import com.nit.todolist.dto.UserDTO;
import com.nit.todolist.models.Project;
import com.nit.todolist.models.User;

import java.util.stream.Collectors;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setProjectIds(user.getProjects().stream().map(Project::getId).collect(Collectors.toList()));
        return dto;
    }

    public static User toEntity(UserCreateDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }
}
