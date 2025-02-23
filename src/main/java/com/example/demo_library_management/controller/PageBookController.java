package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.PageBook;
import com.example.demo_library_management.service.PageBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/page-books")
@RequiredArgsConstructor
public class PageBookController {

    private final PageBookService pageBookService;

    @GetMapping("/get-all-page-books")
    public ResponseEntity<?> getAllPages(@RequestParam Long idBook,
                                         @RequestParam(defaultValue = "0", required = false) int page,
                                         @RequestParam(defaultValue = "10", required = false) int size) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<PageBook> pageBooks = pageBookService.findAllPageBookByIdBook(idBook, pageable);
        return new ResponseEntity<>(pageBooks, HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailPageBook(Long idPageBook) {
        PageBook pageBook = pageBookService.findById(idPageBook);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add-new-page-books")
    public ResponseEntity<?> addNewPageBook(PageBook pageBook) {
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
