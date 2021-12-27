package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.Student;

public interface AddStudentPort {
    public void AddUser(Student persona);
    public boolean validValues(Student persona) throws UnprocesableException;
    public void createUsuario(Student persona) throws UnprocesableException;
}
