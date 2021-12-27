package com.example._Database_DB1.Student.domain;

import com.example._Database_DB1.Usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepositorio extends JpaRepository<student, String> {

    @Query("select u from Usuario u where u.usuario = ?1")
    List<student> findByName(String usuario);


}
