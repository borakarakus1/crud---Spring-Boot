package com.bora.crud.controller;

import com.bora.crud.model.User;
import com.bora.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/api/1.0/kullanicilar")
    public ResponseEntity<?> kullanicilariGetir(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }

    @PostMapping("/api/1.0/kullanici/creat")
    public ResponseEntity<?> kullaniciEkle(@RequestBody User user){
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.getUserById(user.getId())+" ID numaralı kullanıcı oluşturuldu.");
    }
    @GetMapping("/api/1.0/{id}/kullanici")
    public ResponseEntity<?> kullaniciGetir(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUserById(id));
    }
    @DeleteMapping("/api/1.0/{id}/kullanici/delete")
    public ResponseEntity<?> kullaniciSil(@PathVariable Long id){
        userService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id + " ID numaralı Kullanıcı silindi.");
    }

}
