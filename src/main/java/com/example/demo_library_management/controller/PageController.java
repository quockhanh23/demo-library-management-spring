package com.example.demo_library_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/pages")
public class PageController {

    @GetMapping("/get-all-pages")
    public ResponseEntity<?> getAllPages() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailPage(Long pageId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/add-new")
    public ResponseEntity<?> addNewPage() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<?> deletePage() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
