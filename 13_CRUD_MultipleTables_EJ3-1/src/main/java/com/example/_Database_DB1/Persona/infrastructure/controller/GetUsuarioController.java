package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimpleListPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimplePersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping
    public List<SimplePersonaOutputDTO> getAll(){
        return new SimpleListPersonaOutputDTO(getUsuarioPort.getAll()).getSimplePersonaOutputDTOList();
    }
}
