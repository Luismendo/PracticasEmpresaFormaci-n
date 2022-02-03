package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Persona.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteUsuarioController {
    @Autowired
    DeleteUsuarioPort deleteUsuarioPort;

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id) throws NotFoundException {

        //Usuario usuario = usuarioInputDTO.Change(usuarioInputDTO); necesario??
        deleteUsuarioPort.deleteById(id);

    }
}
