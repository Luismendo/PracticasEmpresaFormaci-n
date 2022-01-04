package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.Student;

import java.util.List;

public interface GetStudentPort {
    public List<Student> getAll();
    public Student getById(String id) throws NotFoundException;
    public List<Student> getByName(String name);
}
