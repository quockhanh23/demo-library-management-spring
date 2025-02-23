package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.Transaction;
import com.example.demo_library_management.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/get-all-transactions")
    public ResponseEntity<?> getAllTransactions() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailTransaction(Long transactionId) {
        Transaction transaction = transactionService.findById(transactionId);
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewTransaction(Transaction transaction) {
        transactionService.createTransaction(transaction);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-transaction")
    public ResponseEntity<?> updateTransaction(Long idTransaction, Transaction transaction) {
        Transaction transactionUpdate = transactionService.updateTransaction(idTransaction, transaction);
        return new ResponseEntity<>(transactionUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/delete-hard")
    public ResponseEntity<?> deleteHardTransaction(Long idTransaction) {
        transactionService.deleteHardTransaction(idTransaction);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
