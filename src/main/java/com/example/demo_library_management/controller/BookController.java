package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.Book;
import com.example.demo_library_management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/get-all-books")
    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "0", required = false) int page,
                                    @RequestParam(defaultValue = "10", required = false) int size) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Book> books = bookService.findAll(pageable);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getOneBook(Long bookId) {
        return new ResponseEntity<>(bookService.getDetailBook(bookId), HttpStatus.OK);
    }

    @PostMapping("/add-new-book")
    public ResponseEntity<?> addNewBook(Book book) {
        bookService.createBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-book")
    public ResponseEntity<?> updateBook(Long bookId, Book book) {
        bookService.updateBook(bookId, book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
