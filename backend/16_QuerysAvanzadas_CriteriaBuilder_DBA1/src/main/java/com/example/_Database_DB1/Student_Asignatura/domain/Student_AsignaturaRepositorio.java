package com.example._Database_DB1.Student_Asignatura.domain;


import com.example._Database_DB1.Student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Student_AsignaturaRepositorio extends JpaRepository<Student_Asignatura, String> {

    @Query("select u from Student_Asignatura u where u.asignatura = ?1")
    List<Student_Asignatura> findByName(String branch);

    @Query("select u from Student_Asignatura u where u.student_asig.id_student = ?1")
    List<Student_Asignatura> findByIdStudent(String id_student);

    @Query("select max(id_asignatura) from Student_Asignatura")
    String findMax();


}
