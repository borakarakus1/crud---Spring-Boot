package com.bora.crud.service;

import com.bora.crud.exception.NotFoundException;
import com.bora.crud.exception.UserRoleAlreadyAvailable;
import com.bora.crud.model.UserRole;
import com.bora.crud.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleService {

    @Autowired
    UserRoleRepository userRoleRepository;

    public void createUserRole(UserRole userRole) {
        if (userRoleRepository.findById(userRole.getId()).isPresent()) {
            throw new UserRoleAlreadyAvailable();
        }
        userRoleRepository.save(userRole);
    }

    public void deleteUserRoleById(Long id) {
        if (!userRoleRepository.existsById(id)) {
            throw new NotFoundException();
        }
        userRoleRepository.deleteById(id);
    }

    public Optional<UserRole> getUserRoleById(Long id) {
        if (!userRoleRepository.existsById(id)) {
            throw new NotFoundException();
        }
        return userRoleRepository.findById(id);
    }
    public List<UserRole> getAllUserRoles(){
        return userRoleRepository.findAll();
    }
}
