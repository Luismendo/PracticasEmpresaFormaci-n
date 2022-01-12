package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetFicheroPort;
import com.example._Database_DB1.Usuario.domain.Fichero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetByNameFicheroController {
    @Autowired
    GetFicheroPort getFicheroPort;

    @GetMapping("/name")
    public List<Fichero> getname(@RequestParam("name") String name) throws Exception {
        return getFicheroPort.getByName(name);
    }
}
