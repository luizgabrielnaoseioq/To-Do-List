package com.nit.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDTO {
    private Long id;
    private String text;
    private LocalDateTime createdAt;
    private Long taskId; // ID da tarefa onde o comentário foi adicionado
}
