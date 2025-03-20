package com.nit.todolist.service;

import com.nit.todolist.dto.UserCreateDTO;
import com.nit.todolist.dto.UserDTO;
import com.nit.todolist.models.Project;
import com.nit.todolist.models.User;
import com.nit.todolist.repository.ProjectRepository;
import com.nit.todolist.repository.UserRepository;
import com.nit.todolist.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    public UserService(UserRepository userRepository, ProjectRepository projectRepository) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<UserDTO> getUserById(Long id) {
        return userRepository.findById(id).map(UserMapper::toDTO);
    }

    public UserDTO createUser(UserCreateDTO userCreateDTO) {
        User user = UserMapper.toEntity(userCreateDTO);

        // Linking user with projects
        if (userCreateDTO.getProjectIds() != null) {
            List<Project> projects = projectRepository.findAllById(userCreateDTO.getProjectIds());
            user.setProjects(projects);
        }

        User savedUser = userRepository.save(user);
        return UserMapper.toDTO(savedUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
