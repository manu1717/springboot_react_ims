package com.hndse251f.InventoryMgtSystem.services;

import com.hndse251f.InventoryMgtSystem.dtos.Response;
import com.hndse251f.InventoryMgtSystem.dtos.TransactionRequest;
import com.hndse251f.InventoryMgtSystem.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
