package com.example._Database_DB1.Persona.application.Port;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Persona.domain.Persona;

public interface AddUsuarioPort {
    public void AddUser(Persona persona);
    public boolean validValues(Persona persona) throws UnprocesableException;
    public void createUsuario(Persona persona) throws UnprocesableException;
}
