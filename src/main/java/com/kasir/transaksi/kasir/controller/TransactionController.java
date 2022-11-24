package com.kasir.transaksi.kasir.controller;

import com.kasir.transaksi.kasir.dto.TransactionKasir;
import com.kasir.transaksi.kasir.repository.TransactionRepository;
import com.kasir.transaksi.kasir.request.TransactionRequest;
import com.kasir.transaksi.kasir.response.TransactionResponse;
import com.kasir.transaksi.kasir.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping(value = "/transaksi")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    TransactionService transactionService;


    @GetMapping(value = "/kasir")
    public String cekdata(){
        return "Hello word";

    }

    @PostMapping(value = "/transaction")
    public ResponseEntity<?> getData(@RequestBody TransactionRequest transactionRequest){
//        TransactionResponse response = transactionService.findByTransaction();
        return transactionService;
    }

}
