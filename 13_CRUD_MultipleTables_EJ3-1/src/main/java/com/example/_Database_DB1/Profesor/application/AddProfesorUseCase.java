package com.example._Database_DB1.Profesor.application;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Profesor.application.Port.AddProfesorPort;
import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Profesor.domain.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddProfesorUseCase implements AddProfesorPort {
    @Autowired
    ProfesorRepositorio profesorRepositorio;

    public void AddUser(Profesor profesor){
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL2");
        System.out.println(profesor);
        profesorRepositorio.save(profesor);
    }

    public boolean validValues(Profesor profesor) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
        if (profesor.getBranch()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        return true;
    }

    @Override
    public void createUsuario(Profesor profesor) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL0");
        if(validValues(profesor)){
            AddUser(profesor);
        }
    }
}
