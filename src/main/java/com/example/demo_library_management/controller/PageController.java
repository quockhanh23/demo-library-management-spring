package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.PageBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/page-books")
public class PageController {

    @GetMapping("/get-all-page-books")
    public ResponseEntity<?> getAllPages() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailPageBook(Long pageId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add-new-page-books")
    public ResponseEntity<?> addNewPageBook() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-page-books")
    public ResponseEntity<?> updatePageBooks(List<PageBook> pageBooks) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deletePageBook() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
