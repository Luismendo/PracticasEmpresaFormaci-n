package com.example._Database_DB1.Student_Asignatura.infrastructure.controller;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student_Asignatura.application.Port.DeleteAsignaturaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteAsignaturaController {
    @Autowired
    DeleteAsignaturaPort deleteAsignaturaPort;

    @DeleteMapping("/Asignatura/{id}")
    public void deleteById(@PathVariable String id) throws NotFoundException {
        deleteAsignaturaPort.deleteById(id);

    }
}
