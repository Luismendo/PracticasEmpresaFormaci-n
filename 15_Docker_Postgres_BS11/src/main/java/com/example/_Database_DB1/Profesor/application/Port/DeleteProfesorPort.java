package com.example._Database_DB1.Profesor.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;


public interface DeleteProfesorPort {
    public void deleteById(String id) throws NotFoundException;
}
