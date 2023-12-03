package com.apirest.app.service;


import com.apirest.app.entytis.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

       public User CrearUser(User user) ;

       public List<User> listarTodoLosUser();

       public Optional<User> BuscarPorId(Integer id);

}
