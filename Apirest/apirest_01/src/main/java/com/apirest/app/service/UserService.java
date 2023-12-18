package com.apirest.app.service;

import com.apirest.app.entytis.roles.UserEntytis;

import java.util.List;

public interface UserService {

    public UserEntytis crearUsuarios(UserEntytis userEntytis);

    public List<UserEntytis> buscarTodaLaLista();

    public UserEntytis actualizarPorId(Integer id, UserEntytis userEntytis);


    public void borrarPorId(Integer id);


}
