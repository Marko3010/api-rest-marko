package com.apirest.app.repository;

import com.apirest.app.entytis.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // es una clase que hace conexion con la base de datos
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}
