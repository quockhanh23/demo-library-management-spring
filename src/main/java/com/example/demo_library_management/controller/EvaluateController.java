package com.example.demo_library_management.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/evaluates")
public class EvaluateController {

    @GetMapping("/get-all-evaluates")
    public ResponseEntity<?> getAllEvaluate() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
