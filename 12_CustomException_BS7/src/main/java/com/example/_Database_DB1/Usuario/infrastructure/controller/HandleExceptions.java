package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.AddUsuarioUseCase;
import com.example._Database_DB1.Usuario.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.infrastructure.dto.input.UsuarioInputDTO;
import com.example._Database_DB1.Usuario.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddUsuarioController {
    @Autowired
    AddUsuarioPort addUsuarioPort;

    @PostMapping
    public UsuarioOutputDTO insert(@RequestBody UsuarioInputDTO usuarioInputDTO) throws Exception {
        Usuario usuario = usuarioInputDTO.Change(usuarioInputDTO);
        addUsuarioPort.AddUser(usuario);
        return  new UsuarioOutputDTO(usuario);
    }
}
