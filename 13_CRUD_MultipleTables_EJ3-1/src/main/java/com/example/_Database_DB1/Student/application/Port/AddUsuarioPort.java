package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Student.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.persona;

public interface AddUsuarioPort {
    public void AddUser(persona persona);
    public boolean validValues(persona persona) throws UnprocesableException;
    public void createUsuario(persona persona) throws UnprocesableException;
}
