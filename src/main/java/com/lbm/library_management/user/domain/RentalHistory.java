package com.lbm.library_management.user.domain;

import com.lbm.library_management.book.domain.Book;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class RentalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;

    private LocalDateTime rentalDate;

    private LocalDateTime returnDate;
}
