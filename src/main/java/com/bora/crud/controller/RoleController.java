package com.bora.crud.controller;

import com.bora.crud.model.Role;
import com.bora.crud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Validated
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/api/1.0/rol/create")
    public ResponseEntity<?> rolEkle(@RequestBody Role role){
        roleService.createRole(role);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/api/1.0/roller")
    public ResponseEntity<?> rolleriGetir(){
        return ResponseEntity.status(HttpStatus.OK).body(roleService.getAllRoles());
    }

    @GetMapping("/api/1.0/{id}/rol")
    public ResponseEntity<?> rolGetir(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(roleService.getRoleById(id));
    }

    @DeleteMapping("/api/1.0/{id}/rol/delete")
    public ResponseEntity<?> rolSil(@PathVariable Long id){
        roleService.deleteRoleById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id +" ID Numaralı rol silindi");
    }

}
