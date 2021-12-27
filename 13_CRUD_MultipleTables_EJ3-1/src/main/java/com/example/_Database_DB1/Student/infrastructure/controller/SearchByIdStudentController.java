package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.infrastructure.dto.output.StudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByIdStudentController {
    @Autowired
    GetStudentPort getStudentPort;

    @GetMapping("/usuario/id/{id}")
    public StudentOutputDTO getById(@PathVariable String id) throws NotFoundException {

        return new StudentOutputDTO(getStudentPort.getById(id));
    }

}
