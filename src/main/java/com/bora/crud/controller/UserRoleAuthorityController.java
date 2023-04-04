package com.bora.crud.controller;

import com.bora.crud.model.UserRoleAuthority;
import com.bora.crud.service.UserRoleAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserRoleAuthorityController {

    @Autowired
    UserRoleAuthorityService userRoleAuthorityService;
    @PostMapping("/api/1.0/k-rol-yetki/create")
    public ResponseEntity<?> kullaniciRolYetkiEkle(@RequestBody UserRoleAuthority userRoleAuthority) {
        userRoleAuthorityService.createUserRoleAuthority(userRoleAuthority);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/api/1.0/{id}/k-rol-yetki")
    public ResponseEntity<?> kullaniciRolYetkiGetir(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userRoleAuthorityService.getUserRoleAuthorityById(id));
    }

    @GetMapping("/api/1.0/k-rol-yetkiler")
    public ResponseEntity<?> kullaniciRolYetkileriGetir(){
        return ResponseEntity.status(HttpStatus.OK).body(userRoleAuthorityService.getAllUserRoleAuthorities());
    }

    @DeleteMapping("/api/1.0/{id}/k-rol-yetki/delete")
    public ResponseEntity<?> RolYetkiSil(@PathVariable("id")Long id){
        userRoleAuthorityService.deleteUserRoleAuthorityById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id + " ID numaralı kullanıcı yetki silindi.");
    }

}
