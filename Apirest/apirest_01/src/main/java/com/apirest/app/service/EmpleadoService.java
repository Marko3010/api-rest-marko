package com.apirest.app.service;

import com.apirest.app.entytis.Empleados;

import java.util.List;

public interface EmpleadoService {


    public Empleados crearEmpleadoNuevo(Empleados empleados);

    public List<Empleados> buscarLista();

    public Empleados actualizarEmpleado( Integer id, Empleados empleados);

    public void borrarId(Integer id);

}
