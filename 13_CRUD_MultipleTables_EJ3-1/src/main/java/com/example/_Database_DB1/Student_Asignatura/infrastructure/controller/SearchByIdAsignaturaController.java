package com.example._Database_DB1.Student_Asignatura.infrastructure.controller;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.FullListAsignatura_StudentOutputDTO;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleListAsignatura_StudentOutputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByIdAsignaturaController {
    @Autowired
    GetAsignaturaPort getAsignaturaPort;

    @GetMapping("/Asignatura/{id}")
    public String getById(@PathVariable String id, @RequestParam(defaultValue = "simple") String outputType) throws NotFoundException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String JSon;

        if(outputType.equals("full")) {
            JSon = objectMapper.writeValueAsString(new FullListAsignatura_StudentOutputDTO(getAsignaturaPort.getByIdStudent(id)));
        }else {
            JSon = objectMapper.writeValueAsString(new SimpleListAsignatura_StudentOutputDTO(getAsignaturaPort.getByIdStudent(id)));
        }
        return JSon;

    }

}
