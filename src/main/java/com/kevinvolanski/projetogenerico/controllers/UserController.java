package com.kevinvolanski.projetogenerico.controllers;

import com.kevinvolanski.projetogenerico.models.User;
import com.kevinvolanski.projetogenerico.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> find(Integer id){
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByEmail(String email){
        User user = userRepository.findByEmail(email);
        return user;
    }

    public User findByName(String nome){
        User user = userRepository.findByNome(nome);
        return user;
    }

    public User insert(User user){
        user = userRepository.save(user);
        return user;
    }

    public void delete(Integer id){
        find(id);
        userRepository.deleteById(id);
    }


}
