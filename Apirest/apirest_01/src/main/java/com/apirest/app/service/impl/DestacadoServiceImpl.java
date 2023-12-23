package com.apirest.app.service.impl;


import com.apirest.app.entytis.Destacado;
import com.apirest.app.repository.DestacadoRepository;
import com.apirest.app.service.DestacadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class DestacadoServiceImpl implements DestacadoService {


    @Autowired
    public DestacadoRepository repository;

    @Override
    public Destacado crearNuevoDescatacado(Destacado destacado) {

        Destacado nuevoDestacado = new Destacado();

        nuevoDestacado.setNombre(destacado.getNombre());
        nuevoDestacado.setEdad(destacado.getEdad());
        nuevoDestacado.setDireccion(destacado.getDireccion());
        nuevoDestacado.setSalario(destacado.getSalario());

        return repository.save(nuevoDestacado);
    }

    @Override
    public List<Destacado> buscarTodaLaLista() {
        return repository.findAll();
    }

    @Override
    public Destacado actualizarPorId(Integer id, Destacado destacado) {
        Destacado resultado = repository.findById(id).orElseThrow(() -> new ResolutionException("No se encontro destacado con el id" + id));

        resultado.setNombre(destacado.getNombre());
        resultado.setEdad(destacado.getEdad());
        resultado.setDireccion(destacado.getDireccion());
        resultado.setSalario(destacado.getSalario());

        Destacado destacadoActualizado = repository.save(resultado);

        return destacadoActualizado;
    }

    @Override
    public void  borrarPorId(Integer id) {

        System.out.println("No se encontro destacado con el id" + id);

        repository.deleteById(id);
    }
}

