package com.example.demo_library_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/transactions")
public class TransactionController {

    @GetMapping("/get-all-transactions")
    public ResponseEntity<?> getAllTransactions() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailTransaction(Long transactionId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/add-new")
    public ResponseEntity<?> addNewTransaction() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<?> deleteTransactions() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
