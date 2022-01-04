package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.infrastructure.dto.output.FullListPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.FullPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimpleListPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimplePersonaOutputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping
    public String getAll(@RequestParam(defaultValue = "simple") String outputType) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String JSon;

        if(outputType.equals("full")){
            JSon = objectMapper.writeValueAsString(new FullListPersonaOutputDTO(getUsuarioPort.getAll()).getFullPersonaOutputDTOList());
        }else{
            JSon = objectMapper.writeValueAsString(new SimpleListPersonaOutputDTO(getUsuarioPort.getAll()).getSimplePersonaOutputDTOList());
        }

        return JSon;
    }
}
