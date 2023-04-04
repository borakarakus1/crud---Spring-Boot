package com.bora.crud.service;

import com.bora.crud.exception.NotFoundException;
import com.bora.crud.exception.RoleAlreadyAvailable;
import com.bora.crud.model.Role;
import com.bora.crud.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public void createRole(Role role){
        if (roleRepository.findById(role.getId()).isPresent()){
            throw new RoleAlreadyAvailable();
        }
        roleRepository.save(role);
    }

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(Long id){
        if (!roleRepository.findById(id).isPresent()){
            throw new NotFoundException();
        }
        return roleRepository.findById(id);
    }
    public void deleteRoleById(Long id){
        if(!roleRepository.findById(id).isPresent()){
            throw new NotFoundException();
        }
        roleRepository.deleteById(id);
    }

}
