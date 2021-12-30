package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.UnprocesableException;

import java.util.List;


public interface DeleteStudentPort {
    public void deleteById(String id) throws NotFoundException;
    public void deleteAsigToUser(String id_student, List<String> listIdAsig) throws UnprocesableException;

}
