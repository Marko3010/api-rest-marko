package com.apirest.app.service.impl;


import com.apirest.app.entytis.User;
import com.apirest.app.repository.UserRepository;
import com.apirest.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service // clase de servcio, donde esta la logica del servicio
public class UserServiceImpl implements UserService {

 @Autowired
 public UserRepository repository;

 @Override
 public User CrearUser (User user){
  User usernew = new User();

  usernew.setPassword(user.getPassword());
  usernew.setId(user.getId());
  usernew.setUsername(user.getUsername());

  return repository.save(usernew);

 }

 @Override
 public List<User> listarTodoLosUser() {
   return repository.findAll();
 }

 @Override
 public Optional<User> BuscarPorId(Integer id) {
   return repository.findById(id);
 }

 @Override
 public User actualizarUserPorId(Integer id, User user) {

  User result = repository.findById(id).orElseThrow(() -> new ResolutionException(" el objeto de producto no encontrado" +id));

  result.setUsername(user.getUsername());
  result.setPassword(user.getPassword());
  User userNuevo = repository.save(result);

  return userNuevo;
 }

 @Override
 public void borrarUsuarioid(Integer id) {
  repository.deleteById(id);
  System.out.println("borrado usuario" + id);
 }
}
