package com.example.security.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;

    @ManyToMany(mappedBy = "roles")
    private Set<Member> members;
}
