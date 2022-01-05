package com.example._Database_DB1.Usuario.domain;

import com.example._Database_DB1.Usuario.domain.Fichero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FicheroRepositorio extends JpaRepository<Fichero, Integer> {

    @Query("select u from Fichero u where u.fichero_name = ?1")
    List<Fichero> findByName(String fichero);


}
