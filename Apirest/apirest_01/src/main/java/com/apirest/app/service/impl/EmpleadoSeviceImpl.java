package com.apirest.app.service.impl;

import com.apirest.app.entytis.Empleados;
import com.apirest.app.repository.EmpleadosRepository;
import com.apirest.app.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class EmpleadoSeviceImpl implements EmpleadoService {


    @Autowired
    public EmpleadosRepository repository;

    @Override
    public Empleados crearEmpleadoNuevo(Empleados empleados) {

        Empleados empleadosnuevo = new Empleados();

        empleadosnuevo.setNombre(empleados.getNombre());
        empleadosnuevo.setEdad(empleados.getEdad());
        empleadosnuevo.setSalario(empleados.getSalario());
        empleadosnuevo.setDirecion(empleados.getDirecion());


        return repository.save(empleadosnuevo);
    }

    @Override
    public List<Empleados> buscarLista() {

        return repository.findAll();
    }

    @Override
    public Empleados actualizarEmpleado(Integer id, Empleados empleados) {

        Empleados resultado = repository.findById(id).orElseThrow( () -> new ResolutionException("objeto de producto no encontrado" + id));

        resultado.setNombre(empleados.getNombre());
        resultado.setEdad(empleados.getEdad());
        resultado.setSalario(empleados.getSalario());
        resultado.setDirecion(empleados.getDirecion());

        Empleados empleadonuevo = repository.save(resultado);
        return empleadonuevo;
    }

    @Override
    public void borrarId(Integer id) {

        System.out.println("Se borro de manera correcta el id " + id);
        repository.deleteById(id);
    }

}
