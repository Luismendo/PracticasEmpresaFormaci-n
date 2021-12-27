package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByIdUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping("/usuario/id/{id}")
    public UsuarioOutputDTO getById(@PathVariable String id) throws NotFoundException {

        return new UsuarioOutputDTO(getUsuarioPort.getById(id));
    }

}
