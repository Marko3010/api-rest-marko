package com.apirest.app.service.impl;


import com.apirest.app.entytis.Trabajador;
import com.apirest.app.repository.TrabajadorRepository;
import com.apirest.app.service.TrabajadorService;
import com.apirest.app.util.Constante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;


@Slf4j
@Service
public class TrabajadorSerciveImpl implements TrabajadorService {

    @Autowired
    public TrabajadorRepository repository;


    @Override
    public Trabajador crearNuevoTrabajador(Trabajador trabajador) {
        Trabajador nuevoTrabajador = new Trabajador();

        nuevoTrabajador.setNombre(trabajador.getNombre());
        nuevoTrabajador.setEdad(trabajador.getEdad());
        nuevoTrabajador.setDireccion(trabajador.getDireccion());
        nuevoTrabajador.setSalario(trabajador.getSalario());

        return repository.save(nuevoTrabajador);
    }

    @Override
    public List<Trabajador> buscarTodoLista() {

        return repository.findAll();
    }

    @Override
    public Trabajador actualizarPorId(Integer id, Trabajador trabajador) {
        Trabajador resultado = repository.findById(id).orElseThrow(()-> new ResolutionException("No se econtro el id" + id));

        resultado.setNombre(trabajador.getNombre());
        resultado.setEdad(trabajador.getEdad());
        resultado.setDireccion(trabajador.getDireccion());
        resultado.setSalario(trabajador.getSalario());

        Trabajador nuevoTrabajador = repository.save(resultado);
        return nuevoTrabajador;
    }

    @Override
    public void borrarPorId(Integer id) {

        repository.deleteById(id);

        log.info(Constante.MENSAJE_ERROR + id);

    }

    @Override
    public Trabajador buscarPorId(Integer id) {
        Trabajador resultado = repository.findById(id).orElseThrow(()-> new ResolutionException("No se econtro el id" + id));


        return resultado;
    }
}
