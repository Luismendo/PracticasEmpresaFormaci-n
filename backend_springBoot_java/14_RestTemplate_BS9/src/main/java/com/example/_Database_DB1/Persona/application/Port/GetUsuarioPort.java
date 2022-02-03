package com.example._Database_DB1.Persona.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.Persona;

import java.util.List;

public interface GetUsuarioPort {
    public List<Persona> getAll();
    public Persona getById(int id) throws NotFoundException;
    public List<Persona> getByName(String name);
}
