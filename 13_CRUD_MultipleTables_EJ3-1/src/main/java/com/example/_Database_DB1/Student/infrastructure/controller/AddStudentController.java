package com.example._Database_DB1.Student.infrastructure.controller;


import com.example._Database_DB1.Student.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Student.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.student;
import com.example._Database_DB1.Student.infrastructure.dto.input.UsuarioInputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUsuarioController {
    @Autowired
    AddUsuarioPort addUsuarioPort;

    @PostMapping("/student")
    public UsuarioOutputDTO insert(@RequestBody UsuarioInputDTO usuarioInputDTO) throws UnprocesableException {
        student student = usuarioInputDTO.Change(usuarioInputDTO);
        addUsuarioPort.createUsuario(student);
        return  new UsuarioOutputDTO(student);
    }

}
