package com.example._Database_DB1.Profesor.infrastructure.controller;


import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Profesor.application.Port.AddProfesorPort;
import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Profesor.infrastructure.dto.input.ProfesorInputDTO;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.FullProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProfesorController {
    @Autowired
    AddProfesorPort addProfesorPort;
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @PostMapping("/Profesor")
    public FullProfesorOutputDTO insert(@RequestBody ProfesorInputDTO profesorInputDTO) throws UnprocesableException {
        Profesor profesor = profesorInputDTO.Change(profesorInputDTO, getUsuarioPort);
        addProfesorPort.createUsuario(profesor);
        return  new FullProfesorOutputDTO(profesor);
    }

}
