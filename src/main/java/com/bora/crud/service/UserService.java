package com.bora.crud.service;

import com.bora.crud.exception.NotFoundException;
import com.bora.crud.exception.UserAlreadyAvailable;
import com.bora.crud.model.User;
import com.bora.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(User user) {
        if (userRepository.findById(user.getId()).isPresent()) {
            throw new UserAlreadyAvailable();
        }
        userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NotFoundException();
        }
        return userRepository.findById(id);
    }

    public void deleteUserById(Long id){
       if (!userRepository.existsById(id)){
           throw new NotFoundException();
       }
       userRepository.deleteById(id);
    }


}

