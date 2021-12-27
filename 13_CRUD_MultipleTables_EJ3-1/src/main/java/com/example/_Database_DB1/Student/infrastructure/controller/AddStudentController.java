package com.example._Database_DB1.Student.infrastructure.controller;


import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.student;
import com.example._Database_DB1.Student.infrastructure.dto.input.StudentInputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.StudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddStudentController {
    @Autowired
    AddStudentPort addStudentPort;

    @PostMapping("/student")
    public StudentOutputDTO insert(@RequestBody StudentInputDTO studentInputDTO) throws UnprocesableException {
        student student = studentInputDTO.Change(studentInputDTO);
        addStudentPort.createUsuario(student);
        return  new StudentOutputDTO(student);
    }

}
