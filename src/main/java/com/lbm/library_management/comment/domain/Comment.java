package com.lbm.library_management.comment.domain;

import com.lbm.library_management.board.domain.Board;
import com.lbm.library_management.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private String content;

    private LocalDateTime createAt;

    private Boolean isDeleted;

    private LocalDateTime deletedAt;

    private LocalDateTime updateAt;
}
