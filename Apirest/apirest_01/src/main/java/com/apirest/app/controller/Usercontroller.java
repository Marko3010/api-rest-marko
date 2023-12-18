package com.apirest.app.controller;

import com.apirest.app.entytis.roles.UserEntytis;
import com.apirest.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("user/name")
@RestController
public class Usercontroller {

    @Autowired
    public UserService service;

    @PostMapping
    public UserEntytis crearUsuario(@RequestBody UserEntytis userEntytis){
        return service.crearUsuarios(userEntytis);
    }

    @GetMapping
    public List<UserEntytis> buscarPorId(){
        return service.buscarTodaLaLista();
    }

    @PutMapping("buscar/{id}")
    public UserEntytis actualizarPorId(@PathVariable ("id") Integer id,@RequestBody UserEntytis userEntytis){
        return service.actualizarPorId(id, userEntytis);
    }

    @DeleteMapping ("borrar/{id}")
    public void borrarUsuarioPorId(@PathVariable("id") Integer id){
        service.borrarPorId(id);

    }

}
