package com.apirest.app.repository;


import com.apirest.app.entytis.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // es para la conexion con la base datos // tambien se puede hacer consultas
public interface UserRepository extends JpaRepository<User, Integer> {

}
