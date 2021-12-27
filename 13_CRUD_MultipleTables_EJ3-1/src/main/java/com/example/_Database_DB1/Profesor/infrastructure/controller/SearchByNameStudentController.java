package com.example._Database_DB1.Profesor.infrastructure.controller;

import com.example._Database_DB1.Profesor.infrastructure.dto.output.FullProfesorOutputDTO;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.ListStudentOutputDTO;
import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchByNameStudentController {
    @Autowired
    GetProfesorPort getProfesorPort;

    @GetMapping("/usuario/name/{name}")
    public List<FullProfesorOutputDTO> getByName(@PathVariable String name){
        return new ListStudentOutputDTO(getProfesorPort.getByName(name)).getFullProfesorOutputDTOList();
    }
}
