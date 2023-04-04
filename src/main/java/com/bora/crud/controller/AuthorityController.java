package com.bora.crud.controller;

import com.bora.crud.model.Authority;
import com.bora.crud.service.AuthorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/1.0/yetki")
@Validated
@RequiredArgsConstructor
public class AuthorityController {


    private final AuthorityService authorityService;

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> yetkiEkle(@RequestBody Authority authority){
        authorityService.createAuthority(authority);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/yetkiler")
    public ResponseEntity<?> yetkileriGetir(){
        return new ResponseEntity<>((authorityService.getAllAuthorities()),HttpStatus.OK);
    }

    @GetMapping("/{id}/yetki")
    public ResponseEntity<?> yetkiGetir(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(authorityService.getAuthorityById(id));
    }

    @DeleteMapping("/{id}/yetki/delete")
    public ResponseEntity<?> yetkiSil(@PathVariable Long id){
        authorityService.deleteAuthorityById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id + " ID Numaralı yetki silindi.");
    }

    @PutMapping("/{id}/yetki/update")
    public ResponseEntity<?>yetkiGuncelle(@PathVariable("id") Long id,@RequestBody Authority authority){
        authorityService.updateAuthorityById(id, authority);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}/rev-no/{revNo}/update")
    public ResponseEntity<?> revNoGuncelle(@PathVariable("id") Long id, @PathVariable("revNo") Long revNo) {
        authorityService.updateAuthorityRevNoById(id, revNo);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}/yetki-tip/{yetkiTip}/update")
    public ResponseEntity<?> yetkiTipGuncelle(@PathVariable("id")Long id,@PathVariable("yetkiTip")int yetkiTip) {
        authorityService.updateAuthorityYetkiTipById(id, yetkiTip);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}/yetki-kod/{yetkiKod}/update")
    public ResponseEntity<?> yetkiKodGuncelle(@PathVariable("id")Long id,@PathVariable("yetkiKod")String yetkiKod){
        authorityService.updateAuthorityYetkiKodById(id,yetkiKod);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}/bagli-yetki-kod/{bagliYetkiKod}/update")
    public ResponseEntity<?> bagliYetkiKodGuncelle(@PathVariable("id") Long id ,@PathVariable("bagliYetkiKod")String bagliYetkiKod){
        authorityService.updateAuthorityBagliYetkiKodById(id,bagliYetkiKod);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}/menu-sıra-no/{menuSıraNo}/update")
    public ResponseEntity<?> menuSıraNoGuncelle(@PathVariable("id")Long id , @PathVariable("menuSıraNo")Long menuSıraNo){
        authorityService.updateAuthorityMenuSıraNoById(id,menuSıraNo);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/menu-path/{menuPath}/update")
    public ResponseEntity<?> menuPathGuncelle(@PathVariable("id")Long id,@PathVariable("menuPath")String menuPath){
        authorityService.updateAuthorityMenuPathById(id,menuPath);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/aktif-tarihi/{aktifTarihi}/update")
    public ResponseEntity<?> aktifTarihiGuncelle(@PathVariable("id")Long id,@PathVariable("aktifTarihi") Date aktifTarihi){
        authorityService.updateAuthorityAktifTarihiById(id,aktifTarihi);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/pasif-tarihi/{pasifTarihi}/update")
    public ResponseEntity<?> pasifTarihiGuncelle(@PathVariable("id")Long id,@PathVariable("pasifTarihi")Date pasifTarihi){
        authorityService.updateAuthorityPasifTarihiById(id,pasifTarihi);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/kyt-kullanici/{kytKullanici}/update}")
    public ResponseEntity<?> kytKullaniciGuncelle(@PathVariable("id")Long id,@PathVariable("kytKullanici")String kytKullanici){
        authorityService.updateAuthorityKytKullaniciById(id,kytKullanici);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/kyt-tarihi/{kytTarihi}/update")
    public ResponseEntity<?> kytTarihiGuncelle(@PathVariable("id")Long id,@PathVariable("kytTarihi")Date kytTarihi){
        authorityService.updateAuthorityKytTarihiById(id,kytTarihi);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/gnc-kullanici/{gncKullanici}/update")
    public ResponseEntity<?>gncKullaniciGuncelle(@PathVariable("id")Long id,@PathVariable("gncKullanici")String gncKullanici){
        authorityService.updateAuthorityGncKullaniciById(id,gncKullanici);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/gnc-tarihi/{gncTarihi}/update")
    public ResponseEntity<?>gncTarihiGuncelle(@PathVariable("id")Long id,@PathVariable("gncTarihi")Date gncTarihi){
        authorityService.updateAuthorityGncTarihiById(id,gncTarihi);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @PutMapping("/{id}/proje-kod/{projeKod}/update")
    public ResponseEntity<?>projeKodGuncelle(@PathVariable("id")Long id,@PathVariable("projeKod")String projeKod){
        authorityService.updateAuthorityProjeKodById(id,projeKod);
        return ResponseEntity.status(HttpStatus.OK).build();
   }


}
