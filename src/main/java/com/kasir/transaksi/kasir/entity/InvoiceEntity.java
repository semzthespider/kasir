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
@Table(name = "item")
public class InvoiceEntity implements Serializable {

    @Id
    @Column(name = "id_item")
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    Long id;
    @Column(name = "nama_item")
    String namaItem;
    @Column(name = "harga")
    String harga;


}
