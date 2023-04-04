package com.bora.crud.controller;


import com.bora.crud.model.UserRole;
import com.bora.crud.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;

    @PostMapping("/api/1.0/k-rol/create")
    public ResponseEntity<?> kullaniciRolEkle(@RequestBody UserRole userRole) {
        userRoleService.createUserRole(userRole);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/api/1.0/{id}/k-rol")
    public ResponseEntity<?> kullaniciRolGetir(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userRoleService.getUserRoleById(id));
    }

    @GetMapping("/api/1.0/k-roller")
    public ResponseEntity<?> kullaniciRolleriGetir(){
        return ResponseEntity.status(HttpStatus.OK).body(userRoleService.getAllUserRoles());
    }

    @DeleteMapping("/api/1.0/{id}/k-rol/delete")
    public ResponseEntity<?> kullaniciRolSil(@PathVariable("id")Long id){
        userRoleService.deleteUserRoleById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id + " ID numaralı kullanıcı rol silindi.");
    }
}
