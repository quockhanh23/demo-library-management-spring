package com.example.demo_library_management.service;

import com.example.demo_library_management.models.Book;

import java.util.List;

public interface BookService {

    void createBook(Book book);

    void deleteBook(Long idBook);

    List<Book> getAllBook();

    Book getDetailBook(Long idBook);
}
