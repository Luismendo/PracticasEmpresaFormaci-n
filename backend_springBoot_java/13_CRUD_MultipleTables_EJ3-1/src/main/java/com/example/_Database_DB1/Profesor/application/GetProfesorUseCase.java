package com.example._Database_DB1.Profesor.application;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Persona.domain.UsuarioRepositorio;
import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Profesor.domain.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProfesorUseCase implements GetProfesorPort {
    @Autowired
    ProfesorRepositorio profesorRepositorio;


    public List<Profesor> getAll(){
        return profesorRepositorio.findAll();
    }


    @Override
    public Profesor getById(String id) throws NotFoundException {
        if(profesorRepositorio.findById(id).isPresent()){
            return profesorRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<Profesor> getByName(String name) {
        return profesorRepositorio.findByName(name);
    }
}
