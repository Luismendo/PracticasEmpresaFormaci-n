package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Usuario.domain.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
