package com.example._Database_DB1.Persona.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Persona, Integer> {

    @Query("select u from Persona u where u.usuario = ?1")
    List<Persona> findByName(String persona);


}
