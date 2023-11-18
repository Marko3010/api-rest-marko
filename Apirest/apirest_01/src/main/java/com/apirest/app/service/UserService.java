package com.apirest.app.service;

import com.apirest.app.entytis.User;
import com.apirest.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User createUser(User user){
        User newUser = new User();
        newUser.setNombre(user.getNombre());
        newUser.setApellido(user.getApellido());
        newUser.setEdad(user.getEdad());

        return repository.save(newUser);




    }

}





