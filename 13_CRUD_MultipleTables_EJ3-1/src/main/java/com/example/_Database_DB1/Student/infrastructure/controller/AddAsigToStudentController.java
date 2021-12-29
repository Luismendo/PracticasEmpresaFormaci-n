package com.example._Database_DB1.Student.infrastructure.controller;


import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddAsigToStudentController {
    @Autowired
    AddStudentPort addStudentPort;


    @PostMapping("/Student/asignatura/{id}")
    public void insert(@RequestParam List asignatura, @PathVariable String id) throws UnprocesableException {
        addStudentPort.AddAsigToUser(id, asignatura);
    }

}
