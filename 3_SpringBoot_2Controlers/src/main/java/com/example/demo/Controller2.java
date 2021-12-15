package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController()
public class Controller2 {

    @Autowired
    PersonaService personaService;


    @Qualifier("lista")
    @Autowired
    List<Ciudad> lista;



    @GetMapping("/controlador2/getPersona")
    @ResponseBody
    public User show() {
        return  personaService.getUser();
    }

    @GetMapping("/controlador2/getCiudad")
    @ResponseBody
    public List<Ciudad> getUSer() {
        return lista;
    }
}
