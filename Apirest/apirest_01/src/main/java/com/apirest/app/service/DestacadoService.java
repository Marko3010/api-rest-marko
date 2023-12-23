package com.apirest.app.service;

import com.apirest.app.entytis.Destacado;

import java.util.List;

public interface DestacadoService {


    public Destacado crearNuevoDescatacado(Destacado destacado);

    public List<Destacado> buscarTodaLaLista();

    public Destacado actualizarPorId(Integer id, Destacado destacado);

    public void borrarPorId(Integer id);
}
