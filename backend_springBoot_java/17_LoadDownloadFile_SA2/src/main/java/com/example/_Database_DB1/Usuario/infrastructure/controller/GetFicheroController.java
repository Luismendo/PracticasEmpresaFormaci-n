package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetFicheroPort;
import com.example._Database_DB1.Usuario.domain.Fichero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetFicheroController {
    @Autowired
    GetFicheroPort getFicheroPort;

    @GetMapping("/fichero")
    public List<Fichero> getAll(){
        return getFicheroPort.getAll();
    }
}
