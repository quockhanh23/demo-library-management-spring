package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.Transaction;
import com.example.demo_library_management.repository.TransactionRepository;
import com.example.demo_library_management.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public void createTransaction(Transaction transaction) {

    }
}
