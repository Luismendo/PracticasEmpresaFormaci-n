package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import com.example._Database_DB1.Usuario.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchByIdUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping("id/{id}")
    public UsuarioOutputDTO getById(@PathVariable int id) throws Exception{
        return new UsuarioOutputDTO(getUsuarioPort.getById(id));
    }

}
