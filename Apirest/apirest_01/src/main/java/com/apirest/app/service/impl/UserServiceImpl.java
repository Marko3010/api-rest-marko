package com.apirest.app.service.impl;

import com.apirest.app.entytis.roles.UserEntytis;
import com.apirest.app.repository.UserRepository;
import com.apirest.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository repository;

    @Override
    public UserEntytis crearUsuarios(UserEntytis userEntytis) {
        UserEntytis userNuevo = new UserEntytis();

        userNuevo.setUsername(userEntytis.getUsername());
        userNuevo.setPassword(userEntytis.getPassword());
        userNuevo.setMail(userNuevo.getMail());

        return repository.save(userNuevo);
    }

    @Override
    public List<UserEntytis> buscarTodaLaLista() {
        return repository.findAll();
    }

    @Override
    public UserEntytis actualizarPorId(Integer id, UserEntytis userEntytis) {

        UserEntytis resultado = repository.findById(id).orElseThrow( () -> new ResolutionException("usuario no encontrado" + id));

        resultado.setUsername(userEntytis.getUsername());
        resultado.setPassword(userEntytis.getPassword());
        resultado.setMail(userEntytis.getMail());

        UserEntytis usuarioNuevo = repository.save(resultado);
        return usuarioNuevo;
    }

    @Override
    public void borrarPorId(Integer id) {

        System.out.println("Se borro de manera correcta el id " + id);
        repository.deleteById(id);


    }



}
