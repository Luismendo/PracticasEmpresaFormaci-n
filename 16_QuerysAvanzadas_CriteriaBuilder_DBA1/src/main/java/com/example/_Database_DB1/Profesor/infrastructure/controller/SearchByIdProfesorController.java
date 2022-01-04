package com.example._Database_DB1.Profesor.infrastructure.controller;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.FullProfesorOutputDTO;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.SimpleProfesorOutputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByIdProfesorController {
    @Autowired
    GetProfesorPort getProfesorPort;

    @GetMapping("/Profesor/{id}")
    public String getById(@PathVariable String id, @RequestParam(defaultValue = "simple") String outputType) throws NotFoundException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        if(outputType.equals("full")) {
            String JSon = objectMapper.writeValueAsString(new FullProfesorOutputDTO(getProfesorPort.getById(id)));
            return JSon;
        }else {
            String JSon = objectMapper.writeValueAsString(new SimpleProfesorOutputDTO(getProfesorPort.getById(id)));
            return JSon;
        }

    }

}
