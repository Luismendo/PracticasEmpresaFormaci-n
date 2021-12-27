package com.example._Database_DB1.Profesor.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepositorio extends JpaRepository<Profesor, String> {

    @Query("select u from Profesor u where u.branch = ?1")
    List<Student> findByName(String branch);


}
