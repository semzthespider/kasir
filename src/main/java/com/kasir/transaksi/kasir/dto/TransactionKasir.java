package com.kasir.transaksi.kasir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionKasir {
    String namaPemesan;
    String noInvoice;
}
