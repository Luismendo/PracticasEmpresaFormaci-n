package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.infrastructure.dto.input.UsuarioInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EditUsuarioController {
    @Autowired
    AddUsuarioPort addUsuarioPort;

    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping
    public void insert(@RequestBody UsuarioInputDTO usuarioInputDTO) throws Exception {
        Usuario usuario = usuarioInputDTO.Change(usuarioInputDTO);
        usuario.setId(usuarioInputDTO.getId());
        System.out.println("LOL"+ usuario);
        addUsuarioPort.EditUsuario(usuario);
        //return new UsuarioOutputDTO(usuario);
    }
}
