package com.book.bms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAutor();
    List<Book> findByCategory();
    List<Book> searchBooks();
}
