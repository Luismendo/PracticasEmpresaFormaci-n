package com.example._Database_DB1.Student_Asignatura.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;

import java.util.List;

public interface GetAsignaturaPort {
    public List<Student_Asignatura> getAll();
    public Student_Asignatura getById(String id) throws NotFoundException;
    public List<Student_Asignatura> getByIdStudent(String name);
    public List<Student_Asignatura> getByName(String name);
}
