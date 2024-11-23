package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.Book;
import com.example.demo_library_management.repository.BookRepository;
import com.example.demo_library_management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void createBook(Book book) {

    }
}
