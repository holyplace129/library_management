package com.lbm.library_management.board.domain;

import com.lbm.library_management.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    private String title;

    private String content;

    private LocalDateTime createAt;

    private Boolean isDeleted;

    private LocalDateTime deletedAt;

    private LocalDateTime updateAt;
}
