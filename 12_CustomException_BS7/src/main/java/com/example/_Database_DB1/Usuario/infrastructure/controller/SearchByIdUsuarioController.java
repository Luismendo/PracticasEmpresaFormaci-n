package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Usuario.domain.NotFoundException;
import com.example._Database_DB1.Usuario.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchByIdUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping("id/{id}")
    public UsuarioOutputDTO getById(@PathVariable int id) throws NotFoundException {

        return new UsuarioOutputDTO(getUsuarioPort.getById(id));
    }

}
