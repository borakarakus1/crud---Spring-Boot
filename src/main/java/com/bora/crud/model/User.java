package com.bora.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;



import java.util.Date;

@Entity
@Data
@Table(name = "K_KULLANICI")
public class User {
    @Id
    @Column(name = "ID",nullable = false)
    Long id;
    @Column(name = "REV_NO",nullable = false)
    Long revNo;
    @Column(name = "KULLANICI_KOD",nullable = false,unique = true)
    String kullaniciKod;
    @Column(name ="SICIL_NO")
    String sicilNo;
    @Column(name = "AD")
    String ad;
    @Column(name = "SOYAD")
    String soyad;
    @Column (name = "GSM")
    String gsm;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "AKTIF_TARIHI")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    Date aktifTarihi;
    @Column(name = "PASIF_TARIHI")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    Date pasifTarihi;
    @Column(name = "ACIKLAMA")
    String aciklama;
    @Column(name = "KYT_KULLANICI",nullable = false)
    String kytKullanici;
    @Column(name = "KYT_TARIHI",nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    Date kytTarih;
    @Column(name = "GNC_KULLANICI")
    String gncKullanici;
    @Column(name = "GNC_TARIHI")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    Date gncTarihi;

}
