package com.example._Database_DB1.Profesor.application.Port;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Profesor.domain.Profesor;

public interface AddProfesorPort {
    public void AddUser(Profesor profesor);
    public boolean validValues(Profesor profesor) throws UnprocesableException;
    public void createUsuario(Profesor profesor) throws UnprocesableException;
}
