package com.example._Database_DB1.Persona.infrastructure.controller;


import com.example._Database_DB1.Persona.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Persona.domain.persona;
import com.example._Database_DB1.Persona.infrastructure.dto.input.UsuarioInputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddUsuarioController {
    @Autowired
    AddUsuarioPort addUsuarioPort;

    @PostMapping
    public UsuarioOutputDTO insert(@RequestBody UsuarioInputDTO usuarioInputDTO) throws UnprocesableException {
        persona persona = usuarioInputDTO.Change(usuarioInputDTO);
        addUsuarioPort.createUsuario(persona);
        return  new UsuarioOutputDTO(persona);
    }

}
