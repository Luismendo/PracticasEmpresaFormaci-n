package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.student;

public interface AddStudentPort {
    public void AddUser(student persona);
    public boolean validValues(student persona) throws UnprocesableException;
    public void createUsuario(student persona) throws UnprocesableException;
}
