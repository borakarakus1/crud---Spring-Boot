package com.bora.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "K_ROL")
public class Role {
    @Id
    @Column(name = "ID",nullable = false)
    Long id;
    @Column(name = "REV_NO",nullable = false)
    Long revNo;
    @Column(name = "ROL_KOD",nullable = false,unique = true)
    String rolKod;
    @Column(name = "AKTIF_TARIHI")
    Date aktifTarihi;
    @Column(name = "PASIF_TARIHI")
    Date pasifTarihi;
    @Column(name = "ACIKLAMA")
    String aciklama;
    @Column(name = "KYT_KULLANICI",nullable = false)
    String kytKullanici;
    @Column(name = "KYT_TARIHI",nullable = false)
    Date kytTarih;
    @Column(name = "GNC_KULLANICI")
    String gncKullanici;
    @Column(name = "GNC_TARIHI")
    Date gncTarihi;
}
