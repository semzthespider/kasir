package com.kasir.transaksi.kasir.repository;


import com.kasir.transaksi.kasir.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<InvoiceEntity, Long> {
}
