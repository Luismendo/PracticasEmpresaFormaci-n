package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controll_miconfig {
    @Autowired
    private miconfiguracion miconfiguracion;

    @GetMapping("/miconfiguracion")
    public String getVar3() {
        return miconfiguracion.toString();

    }

}
