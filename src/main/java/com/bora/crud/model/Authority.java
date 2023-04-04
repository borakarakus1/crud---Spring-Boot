package com.bora.crud.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "K_YETKI",uniqueConstraints = {@UniqueConstraint(columnNames = {"PROJE_KOD"})})
public class Authority {
    @Id
    @Column(name = "ID",nullable = false)
    Long id;
    @Column(name = "REV_NO",nullable = false)
    Long revNo;
    @Column(name = "YETKI_TIP")
    Integer yetkiTip;
    @Column(name = "YETKI_KOD",nullable = false,unique = true)
    String yetkiKod;
    @Column(name = "BAGLI_YETKI_KOD",nullable = false)
    String bagliYetkiKod;
    @Column(name = "ACIKLAMA")
    String aciklama;
    @Column(name = "MENU_SIRA_NO")
    Long menuSıraNo;
    @Column(name = "MENU_PATH")
    String menuPath;
    @Column(name = "AKTIF_TARIHI")
    Date aktifTarihi;
    @Column(name = "PASIF_TARIHI")
    Date pasifTarihi;
    @Column(name = "KYT_KULLANICI")
    String kytKullanici;
    @Column(name = "KYT_TARIHI")
    Date kytTarih;
    @Column(name = "GNC_KULLANICI")
    String gncKullanici;
    @Column(name = "GNC_TARIHI")
    Date gncTarihi;
    @Column(name = "PROJE_KOD")
    String projeKod;
}
