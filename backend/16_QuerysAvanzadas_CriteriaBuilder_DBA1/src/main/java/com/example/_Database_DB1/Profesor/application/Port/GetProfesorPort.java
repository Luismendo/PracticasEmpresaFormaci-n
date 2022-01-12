package com.example._Database_DB1.Profesor.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Profesor.domain.Profesor;

import java.util.List;

public interface GetProfesorPort {
    public List<Profesor> getAll();
    public Profesor getById(String id) throws NotFoundException;
    public List<Profesor> getByName(String name);
}
