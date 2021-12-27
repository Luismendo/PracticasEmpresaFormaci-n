package com.example._Database_DB1.Persona.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.persona;

import java.util.List;

public interface GetUsuarioPort {
    public List<persona> getAll();
    public persona getById(int id) throws NotFoundException;
    public List<persona> getByName(String name);
}
