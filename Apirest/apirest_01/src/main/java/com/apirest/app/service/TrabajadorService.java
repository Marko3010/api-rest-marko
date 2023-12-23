package com.apirest.app.service;

import com.apirest.app.entytis.Trabajador;

import java.util.List;

public interface TrabajadorService {


    public Trabajador crearNuevoTrabajador(Trabajador trabajador);

    public List<Trabajador> buscarTodoLista();

    public Trabajador actualizarPorId(Integer id, Trabajador trabajador);

    public void borrarPorId(Integer id);

    public Trabajador buscarPorId(Integer id);
}
