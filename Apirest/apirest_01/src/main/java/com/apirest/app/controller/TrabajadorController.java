package com.apirest.app.controller;

import com.apirest.app.entytis.Trabajador;
import com.apirest.app.service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("buscar/trabajador")
public class TrabajadorController {

    @Autowired
    public TrabajadorService service;


    @PostMapping
    public Trabajador nuevoTrabajador(@RequestBody Trabajador trabajador){

        return service.crearNuevoTrabajador(trabajador);

    }

    @GetMapping
    public List<Trabajador> buscarTodo(){

        return service.buscarTodoLista();
    }

    @PutMapping("actualizar/{id}")
    public Trabajador actualizarPorId(@PathVariable("id") Integer id,@RequestBody Trabajador trabajador){
        return service.actualizarPorId(id, trabajador);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarPorId(@PathVariable("id") Integer id){

        service.borrarPorId(id);
    }

    @GetMapping("buscar/{id}")
    public Trabajador buscarPorId(@PathVariable("id") Integer id){
        return service.buscarPorId(id);
    }
}
