package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;


public interface DeleteStudentPort {
    public void deleteById(String id) throws NotFoundException;
}
