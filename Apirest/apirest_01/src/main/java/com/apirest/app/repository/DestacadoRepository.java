package com.apirest.app.repository;

import com.apirest.app.entytis.Destacado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestacadoRepository extends JpaRepository<Destacado, Integer> {
}
