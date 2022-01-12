package com.example._Database_DB1.Student_Asignatura.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;


public interface DeleteAsignaturaPort {
    public void deleteById(String id) throws NotFoundException;
}
