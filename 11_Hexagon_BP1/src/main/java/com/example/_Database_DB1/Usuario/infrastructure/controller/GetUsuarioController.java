package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping
    public List<Usuario> getAll(){
        return getUsuarioPort.getAll();
    }
}
