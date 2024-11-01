package com.lbm.library_management.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String name;

    private String Email;

    private String password;

    private LocalDateTime createAt;

    private Boolean isDeleted;

    private LocalDateTime deletedAt;
}
