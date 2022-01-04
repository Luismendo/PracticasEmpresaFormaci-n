package com.example._Database_DB1.Persona.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;

public interface DeleteUsuarioPort {
    public void deleteById(int id) throws NotFoundException;
}
