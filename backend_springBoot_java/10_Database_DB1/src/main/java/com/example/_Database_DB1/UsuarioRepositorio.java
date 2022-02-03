package com.example._Database_DB1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    @Query("select u from Usuario u where u.usuario = ?1")
    List<Usuario> findByName(String usuario);

}
