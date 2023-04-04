package com.bora.crud.service;

import com.bora.crud.exception.NotFoundException;
import com.bora.crud.exception.UserRoleAuthorityAvailable;
import com.bora.crud.model.UserRoleAuthority;
import com.bora.crud.repository.UserRoleAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleAuthorityService {
    @Autowired
    UserRoleAuthorityRepository userRoleAuthorityRepository;

    public void createUserRoleAuthority(UserRoleAuthority userRoleAuthority) {
        if (userRoleAuthorityRepository.findById(userRoleAuthority.getId()).isPresent()) {
            throw new UserRoleAuthorityAvailable();
        }
        userRoleAuthorityRepository.save(userRoleAuthority);
    }

    public void deleteUserRoleAuthorityById(Long id) {
        if (!userRoleAuthorityRepository.existsById(id)) {
            throw new NotFoundException();
        }
        userRoleAuthorityRepository.deleteById(id);
    }

    public Optional<UserRoleAuthority> getUserRoleAuthorityById(Long id) {
        if (!userRoleAuthorityRepository.existsById(id)) {
            throw new NotFoundException();
        }
        return userRoleAuthorityRepository.findById(id);
    }
    public List<UserRoleAuthority> getAllUserRoleAuthorities(){
        return userRoleAuthorityRepository.findAll();
    }
}
