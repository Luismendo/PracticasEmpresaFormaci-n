package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
