package com.lbm.library_management.book.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;

    private String title;

    private String author;

    private String publisher;

    private Integer publisherYear;

    @Enumerated(value = EnumType.STRING)
    private BookStatus bookStatus;


}
