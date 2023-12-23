package com.apirest.app.controller;

import com.apirest.app.entytis.Destacado;
import com.apirest.app.service.DestacadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("buscar/destacado")
@RestController
public class DestacadoController {


    @Autowired
    public DestacadoService service;

    @PostMapping
    public Destacado nuevoDescatado(@RequestBody Destacado destacado){
        return service.crearNuevoDescatacado(destacado);
    }

    @GetMapping
    public List<Destacado> buscarTodoDeLaLista(){
        return service.buscarTodaLaLista();
    }

    @PutMapping("actualizar/{id}")
    public Destacado actualizarDestacado(@PathVariable("id") Integer id,@RequestBody Destacado destacado){
        return service.actualizarPorId(id, destacado);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarPorId(@PathVariable("id") Integer id){
        service.borrarPorId(id);

    }
}
