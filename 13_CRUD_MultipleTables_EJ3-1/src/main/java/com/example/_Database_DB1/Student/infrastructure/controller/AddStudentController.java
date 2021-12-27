package com.example._Database_DB1.Student.infrastructure.controller;


import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.Student;
import com.example._Database_DB1.Student.infrastructure.dto.input.StudentInputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.FullStudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddStudentController {
    @Autowired
    AddStudentPort addStudentPort;
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @PostMapping("/Student")
    public FullStudentOutputDTO insert(@RequestBody StudentInputDTO studentInputDTO) throws UnprocesableException {
        Student student = studentInputDTO.Change(studentInputDTO, getUsuarioPort);
        addStudentPort.createUsuario(student);
        return  new FullStudentOutputDTO(student);
    }

}
