package com.example._Database_DB1.Student_Asignatura.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student.infrastructure.dto.output.FullStudentOutputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.ListStudentOutputDTO;
import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleAsignaturaOutputDTO;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleListAsignatura_StudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAsignatureController {
    @Autowired
    GetAsignaturaPort getAsignaturaPort;

    @GetMapping("/Asignatura")
    public List<SimpleAsignaturaOutputDTO> getAll(){
        return new SimpleListAsignatura_StudentOutputDTO(getAsignaturaPort.getAll()).getSimpleAsignaturaOutputDTOList();
    }
}
