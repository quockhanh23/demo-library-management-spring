package com.example.demo_library_management.service;

import com.example.demo_library_management.models.Transaction;

public interface TransactionService {

    void createTransaction(Transaction transaction);

    Transaction updateTransaction(Long idTransaction, Transaction transaction);

    Transaction findById(Long idTransaction);
}
