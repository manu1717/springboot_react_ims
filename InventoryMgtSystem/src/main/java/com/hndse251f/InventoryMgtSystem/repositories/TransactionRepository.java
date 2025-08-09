package com.hndse251f.InventoryMgtSystem.repositories;

import com.hndse251f.InventoryMgtSystem.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {


}
