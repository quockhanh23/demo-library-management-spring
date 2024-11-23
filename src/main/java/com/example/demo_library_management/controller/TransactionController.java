package com.example.demo_library_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewTransaction() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteTransactions() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
