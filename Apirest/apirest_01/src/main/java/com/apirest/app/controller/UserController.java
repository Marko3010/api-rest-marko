package com.apirest.app.controller;

import com.apirest.app.entytis.User;
import com.apirest.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // el controlador es el punto del consumo al cliente
@RequestMapping("api/user")
public class UserController {


    @Autowired  // inyecctar el servicio  ( llamar a la funciones)
    private UserService service;

    @PostMapping // Para crear, solicitud, producto, funcion
    public User guardarUser(@RequestBody User user){ /// requestboddy --> hace la conversion a jason a java
        return service.CrearUser(user);
    }

    @GetMapping // Consulta
    public List<User> listarTodo(){
        return service.listarTodoLosUser(); // que retorne listar todo los usuarios
    }

    @GetMapping("buscar/{id}")
    public Optional<User> listaPorId(@PathVariable Integer id){ //patchvariable --> transforma a una variable en lenguaje java para consulta
        return service.BuscarPorId(id);
    }
    @PutMapping("buscar/{id}") // Actualizar
    public User actualizarUser(@PathVariable Integer id,@RequestBody User user){
        return service.actualizarUserPorId(id, user);
    }

    @DeleteMapping("buscar/{id}")
    public void borrarUsuario(@PathVariable Integer id){
       service.borrarUsuarioid(id);

    }
}
