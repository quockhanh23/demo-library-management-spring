package com.example.demo_library_management.service;

import com.example.demo_library_management.models.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    void createBook(Book book);

    void updateBook(Long idBook, Book book);

    void deleteBook(Long idBook);

    List<Book> getAllBook();

    Book getDetailBook(Long idBook);

    Page<Book> findAll(Pageable pageable);
}
