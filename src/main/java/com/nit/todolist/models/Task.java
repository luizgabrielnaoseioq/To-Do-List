package com.nit.todolist.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // "Pending", "In Progress", "Completed"

    // Many-to-One relationship with Project
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    // One-to-Many relationship with Comment
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
