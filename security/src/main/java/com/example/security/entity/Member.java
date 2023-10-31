package com.example.security.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="member_roles",
            joinColumns = @JoinColumn(name="member_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )

    private Set<Role> roles;
}
