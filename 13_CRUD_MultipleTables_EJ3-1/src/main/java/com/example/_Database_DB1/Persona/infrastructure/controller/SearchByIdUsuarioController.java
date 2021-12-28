package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.infrastructure.dto.output.FullPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimplePersonaOutputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchByIdUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping("/Persona/{id}")
    public String getById(@PathVariable int id, @RequestParam(defaultValue = "simple") String outputType) throws NotFoundException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String JSon;

        if(outputType.equals("full")) {
            JSon = objectMapper.writeValueAsString(new FullPersonaOutputDTO(getUsuarioPort.getById(id)));
        }else {
            JSon = objectMapper.writeValueAsString(new SimplePersonaOutputDTO(getUsuarioPort.getById(id)));
        }
        return JSon;

    }

}
