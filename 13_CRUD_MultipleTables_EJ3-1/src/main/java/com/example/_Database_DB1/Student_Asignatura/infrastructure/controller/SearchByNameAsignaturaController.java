package com.example._Database_DB1.Student_Asignatura.infrastructure.controller;

import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleAsignaturaOutputDTO;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleListAsignatura_StudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchByNameAsignaturaController {
    @Autowired
    GetAsignaturaPort getAsignaturaPort;

    @GetMapping("/Asignatura/name/{name}")
    public List<SimpleAsignaturaOutputDTO> getByName(@PathVariable String name){
        return new SimpleListAsignatura_StudentOutputDTO(getAsignaturaPort.getByName(name)).getSimpleAsignaturaOutputDTOList();
    }
}
