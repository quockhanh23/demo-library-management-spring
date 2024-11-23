package com.example.demo_library_management.controller;

import com.example.demo_library_management.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/get-all-books")
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getOneBook(Long bookId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/add-new")
    public ResponseEntity<?> addNewBook() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<?> deleteBook() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
