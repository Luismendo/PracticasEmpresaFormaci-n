package com.example._Database_DB1.Profesor.infrastructure.controller;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Profesor.application.Port.DeleteProfesorPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteStudentController {
    @Autowired
    DeleteProfesorPort deleteProfesorPort;

    @DeleteMapping("usuario/id/{id}")
    public void deleteById(@PathVariable String id) throws NotFoundException {

        //Usuario usuario = usuarioInputDTO.Change(usuarioInputDTO); necesario??
        deleteProfesorPort.deleteById(id);

    }
}
