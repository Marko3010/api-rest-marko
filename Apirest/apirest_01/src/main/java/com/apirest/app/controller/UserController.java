package com.apirest.app.controller;

import com.apirest.app.entytis.User;
import com.apirest.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping
    public User guardarUser(@RequestBody User user){
        return service.CrearUser(user);
    }

    @GetMapping
    public List<User> listarTodo(){
        return service.listarTodoLosUser();
    }

    @GetMapping("buscar/{id}")
    public Optional<User> listaPorId(@PathVariable Integer id){
        return service.BuscarPorId(id);
    }
}
