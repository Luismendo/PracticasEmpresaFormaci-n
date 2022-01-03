package com.example._Database_DB1.Student_Asignatura.application.Port;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;

public interface AddAsignaturaPort {
    public void AddUser(Student_Asignatura profesor);
    public boolean validValues(Student_Asignatura profesor) throws UnprocesableException;
    public void createUsuario(Student_Asignatura profesor) throws UnprocesableException;
}
