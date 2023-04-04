package com.bora.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


import java.util.Date;

@Entity
@Data
@Table(name = "K_KULLANICI_ROL")
public class UserRole {
    @Id
    @Column(name = "ID",nullable = false)
    Long id;
    @Column(name = "REV_NO",nullable = false)
    Long revNo;
    @Column(name = "KULLANICI_ID",nullable = false)
    Long kullaniciId;
    @Column(name ="ROL_ID",nullable = false)
    Long rolId;
    @Column(name = "ACIKLAMA")
    String aciklama;
    @Column(name = "AKTIF_TARIHI")
    Date aktifTarihi;
    @Column(name = "PASIF_TARIHI")
    Date pasifTarihi;
    @Column(name = "KYT_KULLANICI",nullable = false)
    String kytKullanici;
    @Column(name = "KYT_TARIHI",nullable = false)
    Date kytTarih;
    @Column(name = "GNC_KULLANICI")
    String gncKullanici;
    @Column(name = "GNC_TARIHI")
    Date gncTarihi;
}
