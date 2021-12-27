package com.example._Database_DB1.Student.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepositorio extends JpaRepository<Student, String> {

    @Query("select u from Student u where u.branch = ?1")
    List<Student> findByName(String branch);


}
