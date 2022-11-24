package com.kasir.transaksi.kasir.service;

import com.kasir.transaksi.kasir.dto.TransactionKasir;
import com.kasir.transaksi.kasir.entity.InvoiceEntity;
import com.kasir.transaksi.kasir.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionKasir findByTransaction(Long id){
        InvoiceEntity invoice = transactionRepository.findById(id).orElse(null);
        return TransactionKasir.builder()
                .namaPemesan(invoice.getId() +""+invoice.getNamaItem())
                .noInvoice(invoice.getHarga())
            .build();

    }


    public List<TransactionKasir> findAll(){
        List<InvoiceEntity> invoice = transactionRepository.findAll();
        return TransactionKasir.builder()
                .namaPemesan(invoice. +""+invoice.getNamaItem())
                .noInvoice(invoice.getHarga())
                .build();

    }


}
