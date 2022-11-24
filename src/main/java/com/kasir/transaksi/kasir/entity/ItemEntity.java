package com.kasir.transaksi.kasir.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Data
@Table(name = "invoice")
public class ItemEntity implements Serializable {
    @Id
    @Column(name = "no_invoice", length = 36)
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private Long id;
    @Column(name = "nama_pemesan")
    private String namaPemesan;
    @Column (name = "qty")
    private String qty;
    @Column (name = "harga")
    private String harga;
    @Column (name = "jumlah_harga")
    private String jumlahHarga;
    @Column (name = "id_item")
    private String idItem;


}
