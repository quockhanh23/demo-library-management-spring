package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.Book;
import com.example.demo_library_management.repository.BookRepository;
import com.example.demo_library_management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Long idBook, Book book) {
        Book detailBook = getDetailBook(idBook);
        detailBook.setAuthor(book.getAuthor());
        detailBook.setPublisher(book.getPublisher());
        detailBook.setTitle(book.getTitle());
        bookRepository.save(detailBook);
    }

    @Override
    public void deleteBook(Long idBook) {
        bookRepository.deleteById(idBook);
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = bookRepository.findAll();
        if (CollectionUtils.isEmpty(bookList)) return new ArrayList<>();
        return bookList;
    }

    @Override
    public Book getDetailBook(Long idBook) {
        Optional<Book> bookOptional = bookRepository.findById(idBook);
        if (bookOptional.isEmpty()) {
            throw new RuntimeException("Không tồn tại");
        }
        return bookOptional.get();
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}
