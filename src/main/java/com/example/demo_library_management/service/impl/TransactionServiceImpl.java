package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.common.TransactionStatus;
import com.example.demo_library_management.constant.Constants;
import com.example.demo_library_management.models.Transaction;
import com.example.demo_library_management.repository.TransactionRepository;
import com.example.demo_library_management.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public void createTransaction(Transaction transaction) {
        transaction.setCreatedAt(new Date());
        transaction.setStatus(TransactionStatus.PROGRESS);
        transactionRepository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Long idTransaction, Transaction transaction) {
        Transaction oldTransaction = findById(idTransaction);
        oldTransaction.setUpdatedAt(new Date());
        oldTransaction.setReturnDate(transaction.getReturnDate());
        transactionRepository.save(transaction);
        return oldTransaction;
    }

    @Override
    public Transaction findById(Long idTransaction) {
        Optional<Transaction> transactionOptional = transactionRepository.findById(idTransaction);
        if (transactionOptional.isEmpty()) {
            throw new RuntimeException(Constants.NOT_FOUND);
        }
        return transactionOptional.get();
    }

    @Override
    public void deleteHardTransaction(Long idTransaction) {
        transactionRepository.deleteById(idTransaction);
    }
}
