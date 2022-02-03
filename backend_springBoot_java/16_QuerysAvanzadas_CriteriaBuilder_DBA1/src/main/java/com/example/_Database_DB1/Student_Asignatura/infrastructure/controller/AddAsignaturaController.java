package com.example._Database_DB1.Student_Asignatura.infrastructure.controller;


import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student_Asignatura.application.Port.AddAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.input.Student_AsignaturaInputDTO;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.FullAsignaturaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddAsignaturaController {
    @Autowired
    AddAsignaturaPort addAsignaturaPort;
    @Autowired
    GetStudentPort getStudentPort;

    @PostMapping("/Asignatura")
    public FullAsignaturaOutputDTO insert(@RequestBody Student_AsignaturaInputDTO studentAsignaturaInputDTO) throws UnprocesableException {
        Student_Asignatura student_asignatura = studentAsignaturaInputDTO.Change(studentAsignaturaInputDTO, getStudentPort);
        addAsignaturaPort.createUsuario(student_asignatura);
        return  new FullAsignaturaOutputDTO(student_asignatura);
    }

}
