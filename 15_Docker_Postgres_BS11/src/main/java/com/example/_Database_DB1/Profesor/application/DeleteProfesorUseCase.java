package com.example._Database_DB1.Profesor.application;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Profesor.application.Port.DeleteProfesorPort;
import com.example._Database_DB1.Profesor.domain.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProfesorUseCase implements DeleteProfesorPort {
    @Autowired
    ProfesorRepositorio profesorRepositorio;


    @Override
    public void deleteById(String id) throws NotFoundException {
        if(profesorRepositorio.findById(id).isPresent()){
            profesorRepositorio.deleteById(id);
        }
    }

}
