package com.example._Database_DB1.Student_Asignatura.application;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student_Asignatura.application.Port.DeleteAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.domain.Student_AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAsignaturaUseCase implements DeleteAsignaturaPort {
    @Autowired
    Student_AsignaturaRepositorio student_asignaturaRepositorio;


    @Override
    public void deleteById(String id) throws NotFoundException {
        if(student_asignaturaRepositorio.findById(id).isPresent()){
            student_asignaturaRepositorio.deleteById(id);
        }
    }

}
