package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.infrastructure.dto.output.FullStudentOutputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.SimpleStudentOutputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByIdStudentController {
    @Autowired
    GetStudentPort getStudentPort;

    @GetMapping("/Student/{id}")
    public String getById(@PathVariable String id, @RequestParam(defaultValue = "simple") String outputType) throws NotFoundException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        if(outputType.equals("full")) {
            String JSon = objectMapper.writeValueAsString(new FullStudentOutputDTO(getStudentPort.getById(id)));
            return JSon;
        }else {
            String JSon = objectMapper.writeValueAsString(new SimpleStudentOutputDTO(getStudentPort.getById(id)));
            return JSon;
        }

    }

}
