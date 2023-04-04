package com.bora.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


import java.util.Date;

@Entity
@Data
@Table(name = "K_ROL_YETKI")
public class UserRoleAuthority {
    @Id
    @Column(name = "ID",nullable = false)
    Long id;
    @Column(name = "REV_NO",nullable = false)
    Long revNo;
    @Column(name ="ROL_ID",nullable = false)
    Long rolId;
    @Column(name = "YETKI_ID",nullable = false)
    Long yetkiId;
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
