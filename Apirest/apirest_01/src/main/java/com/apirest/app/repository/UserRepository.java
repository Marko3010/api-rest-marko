package com.apirest.app.repository;


import com.apirest.app.entytis.roles.UserEntytis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntytis, Integer>{

}
