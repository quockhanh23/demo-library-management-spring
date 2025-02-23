package com.example.demo_library_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/views")
public class ViewController {

    @GetMapping("/get-all-views")
    public ResponseEntity<?> getAllView() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
