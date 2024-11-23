package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.Book;
import com.example.demo_library_management.service.BookService;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
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
    public ResponseEntity<?> updateBook(Book book) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
