package com.example._Database_DB1.Persona.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<persona, Integer> {

    @Query("select u from persona u where u.persona = ?1")
    List<persona> findByName(String persona);


}
