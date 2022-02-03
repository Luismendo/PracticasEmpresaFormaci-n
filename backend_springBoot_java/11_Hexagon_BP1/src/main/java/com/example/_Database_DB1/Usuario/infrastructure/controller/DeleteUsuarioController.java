package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import com.example._Database_DB1.Usuario.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeleteUsuarioController {
    @Autowired
    DeleteUsuarioPort deleteUsuarioPort;

    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id) throws Exception {

        //Usuario usuario = usuarioInputDTO.Change(usuarioInputDTO); necesario??
        deleteUsuarioPort.deleteById(id);

    }
}
