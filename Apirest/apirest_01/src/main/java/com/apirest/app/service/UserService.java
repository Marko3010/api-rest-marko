package com.apirest.app.service;


import com.apirest.app.entytis.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

       public User CrearUser(User user) ;

       public List<User> listarTodoLosUser();    // son funciones vacias, en el user implementacion es donde se asigna la logica

       public Optional<User> BuscarPorId(Integer id);

       public User actualizarUserPorId(Integer id, User user);

       public void borrarUsuarioid(Integer id);

}
